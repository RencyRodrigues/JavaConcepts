package vehicles;

//Create two subclasses of "Vehicle": "Car" and "Truck". The "Car" class should have an additional attribute called "numDoors" and 
//"carType" and the "Truck" class should have an additional attribute called "loadCapacity" and "No. of wheels". Write getter and setter
//methods for these attributes. subclasses should also have a method called "getDescription" that returns the details describing the car and
//truck respectively.
public class Cars extends Vehicle{
private int numDoors;
private String carType;
public int getNumDoors() {
	return numDoors;
}
public void setNumDoors(int numDoors) {
	this.numDoors = numDoors;
}
public String getCarType() {
	return carType;
}
public void setCarType(String carType) {
	this.carType = carType;
}
public void getDescription() {
	System.out.println("Car type:"+getCarType());
	System.out.println("number of doors:"+getNumDoors());
	System.out.println("Make: " + getMake());
	System.out.println("Model: " + getModel());
	System.out.println("Year: " + getYear());
	System.out.println("price:" + getPrice()+"$");
	System.out.println("==============================================");
	System.out.println("");
}
}
