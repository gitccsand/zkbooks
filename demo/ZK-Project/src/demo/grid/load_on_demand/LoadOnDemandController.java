package demo.grid.load_on_demand;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zul.GroupsModel;
import org.zkoss.zul.SimpleGroupsModel;

import demo.data.Mail;
import demo.data.MailModel;

public class LoadOnDemandController extends SelectorComposer<Component> {
	private static final long serialVersionUID = 1L;
	
	private final GroupsModel<Mail, Object, Object> groupsModel = 
			new SimpleGroupsModel<Mail, String, Object, Object>(MailModel.allData, MailModel.headers);

	public GroupsModel<Mail, Object, Object> getMailData() {
		return groupsModel;
	}
}
