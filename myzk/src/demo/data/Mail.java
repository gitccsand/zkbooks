package demo.data;

public class Mail {
	
	private Integer index;
	private String subject;
	private String date;
	private Integer size;
	
	
	public Mail(Integer index, String subject, String date, Integer size) {
		super();
		this.index = index;
		this.subject = subject;
		this.date = date;
		this.size = size;
	}


	public Integer getIndex() {
		return index;
	}


	public void setIndex(Integer index) {
		this.index = index;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Integer getSize() {
		return size;
	}


	public void setSize(Integer size) {
		this.size = size;
	}
	
	

	
}
