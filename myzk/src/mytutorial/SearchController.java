package mytutorial;

import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Image;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Textbox;

import mytutorial.model.Car;
import mytutorial.service.CarService;
import mytutorial.service.impl.CarServeImpl;


public class SearchController extends SelectorComposer<Component> {
	
	
	private static final long serialVersionUID = 1L;
	
	@Wire
	private Textbox KeywordBox;
	@Wire
	private Button SearchButton;
	@Wire
	private Listbox carListbox;
	@Wire
	private Image previewImage;
	@Wire
	private Label modelLabel;
	@Wire
	private Label makeLabel;
	@Wire
	private Label priceLabel;
	@Wire
	private Label descriptionLabel;
	
	
	private CarService carService = new CarServeImpl();
	
	@SuppressWarnings("unchecked")
	@Listen("onClick = #searchButton")	
	public void search(){
		String keyWord = KeywordBox.getValue();
		List<Car> result = carService.search(keyWord);
		carListbox.setModel((ListModel<Car>) result);
	}
	
	
}