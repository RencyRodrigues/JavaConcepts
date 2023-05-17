package vehicles;
//6. Create a class hierarchy for vehicles. There should be a base class called "Vehicle" that has private attributes for "make", "model",
//"year", and "price". Write getter and setter methods for these attributes. The base class should also have a method called 
//"getDescription" that returns the details describing the vehicle.


public class Vehicle {
	private String Make;
	private String Model;
	private int year;
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private double price; 


public void getDescription() {
	System.out.println("Make: " + getMake());
	System.out.println("Model: " + getModel());
	System.out.println("Year: " + getYear());
	System.out.println("price:" + getPrice());
	System.out.println("==============================================");

}

}