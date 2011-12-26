import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CarBean implements Serializable {
	private List<Car> cars;
	public CarBean() {
	cars = new ArrayList<Car>();
	cars.add(new Car("myModel",2005,"ManufacturerX","blue"));
	cars.add(new Car("myModel",2005,"ManufacturerX","blue"));
	cars.add(new Car("myModel",2005,"ManufacturerX","blue"));
	cars.add(new Car("myModel",2005,"ManufacturerX","blue"));
	cars.add(new Car("myModel",2005,"ManufacturerX","blue"));
	cars.add(new Car("myModel",2005,"ManufacturerX","blue"));
	cars.add(new Car("myModel",2005,"ManufacturerX","blue"));
	//add more cars
	}
	public List<Car> getCars() {
	return cars;
}
}