package mytutorial;

import java.util.List;
import java.util.Set;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Image;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.ext.Selectable;

import mytutorial.model.Car;
import mytutorial.service.CarService;
import mytutorial.service.impl.CarServeImpl;


public class SearchController extends SelectorComposer<Component> {
	
	
	private static final long serialVersionUID = 2L;
	
	@Wire
	private Textbox keywordBox;
	@Wire
	private Button searchButton;
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
		String keyWord = keywordBox.getValue();
		List<Car> result = carService.search(keyWord);
		carListbox.setModel(new ListModelList<Car>(result));
//		carListbox.setModel((ListModelList<Car>) result);
	}
	
	@Listen("onSelect = #carListbox")
	public void carDetail(){
		Set<Car> selection = ((Selectable<Car>)carListbox.getModel()).getSelection();
		if(selection!=null & !selection.isEmpty()){
			Car selected = selection.iterator().next();
			previewImage.setSrc(selected.getPreview());
			modelLabel.setValue(selected.getModel());
			makeLabel.setValue(selected.getMake());
			priceLabel.setValue(selected.getPrice().toString());
			descriptionLabel.setValue(selected.getDescription());
		}
	}
	
	
}