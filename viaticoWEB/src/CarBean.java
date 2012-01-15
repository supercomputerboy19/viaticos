import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CarBean implements Serializable {
	private List<Car> cars;
	public CarBean() {
	cars = new ArrayList<Car>();
	cars.add(new Car("Villanueva","Mendoza","Juan Carlos","1023"));
	cars.add(new Car("Barrantes","Rodriguez","Rolando","1020"));
	cars.add(new Car("Gonzales","Zapata","Carlos Renzo","1073"));
	cars.add(new Car("Cespedes","Soriano","Jose","1091"));
	cars.add(new Car("Carranza","Lopez","Jorge","1063"));
	cars.add(new Car("Herrera","Toma","Manuel","1083"));
	cars.add(new Car("Salazar","Perez","Miguel","1073"));
	cars.add(new Car("Saldarriaga","Acevedo","Marcos","1093"));
	cars.add(new Car("Benavente","Li","Julio","1223"));
	cars.add(new Car("Aranda","Alvarez","Santiago","1443"));
	cars.add(new Car("myModel","2005","ManufacturerX","1726"));
	cars.add(new Car("myModel","2005","ManufacturerX","1027"));
	cars.add(new Car("myModel","2005","ManufacturerX","1028"));
	cars.add(new Car("myModel","2005","ManufacturerX","1227"));
	cars.add(new Car("myModel","2005","ManufacturerX","0853"));
	cars.add(new Car("myModel","2005","ManufacturerX","0234"));
	cars.add(new Car("myModel","2005","ManufacturerX","0632"));
	cars.add(new Car("myModel","2005","ManufacturerX","0542"));
	cars.add(new Car("myModel","2005","ManufacturerX","7532"));
	cars.add(new Car("myModel","2005","ManufacturerX","5342"));
	cars.add(new Car("myModel","2005","ManufacturerX","5633"));
	//add more cars
	}
	public List<Car> getCars() {
	return cars;
}
}