package vehicles;

//Create two subclasses of "Vehicle": "Car" and "Truck". The "Car" class should have an additional attribute called "numDoors" and 
//"carType" and the "Truck" class should have an additional attribute called "loadCapacity" and "No. of wheels". Write getter and setter
//methods for these attributes. subclasses should also have a method called "getDescription" that returns the details describing the car and
//truck respectively.
public class Truck extends Vehicle{
private int loadCapacity;
private int no_of_wheels;
public int getLoadCapacity() {
	return loadCapacity;
}
public void setLoadCapacity(int loadCapacity) {
	this.loadCapacity = loadCapacity;
}
public int getNo_of_wheels() {
	return no_of_wheels;
}
public void setNo_of_wheels(int no_of_wheels) {
	this.no_of_wheels = no_of_wheels;
}
public void getDescription() {
	System.out.println("load Capacity: " + getLoadCapacity()+"tonnes");
	System.out.println("number of wheels: " + getNo_of_wheels());
	System.out.println("Make: " + getMake());
	System.out.println("Model: " + getModel());
	System.out.println("Year: " + getYear());
	System.out.println("price:" + getPrice()+"$");
	System.out.println("==============================================");

}
}
