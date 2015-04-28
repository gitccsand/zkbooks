package mytutorial.model;

public class Car {
	private Integer id;
	private String model;
	private String make;
	private String description;
	private String preview;
	private Integer price;
	
	
	
	public Car() {
	}
	//omit getter and setter for brevity
	
	public Car(Integer id, String model, String make, String description,
			String preview, Integer price) {
		super();
		this.id = id;
		this.model = model;
		this.make = make;
		this.description = description;
		this.preview = preview;
		this.price = price;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getPreview() {
		return preview;
	}
	public void setPreview(String preview) {
		this.preview = preview;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	
	
}