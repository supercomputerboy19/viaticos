import java.io.Serializable;

public class Car  implements Serializable {
	
	public Car(String model, String year, String manufacturer, String color) {
		this.model	= model;
		this.year	= year;
		this.manufacturer = manufacturer;
		this.color = color;
	}
	
	private String model;
	private String year;
	private String manufacturer;
	private String color;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}