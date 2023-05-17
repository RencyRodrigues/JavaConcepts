package vehicles;
//Finally, create a class called "VehicleTest" with a main method that creates several "Vehicle" objects, including some "Car" objects 
//and some "Truck" objects. Call the "getDescription" method on each object to print out a description of the vehicle.
public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle v=new Vehicle();
		Cars c=new Cars();
		Truck t=new Truck();
//v.getDescription();
c.setCarType("SUV");
c.setNumDoors(5);
c.setMake("Hyundai");
c.setModel("Palisade Ultimate Caligraphy");
c.setYear(2022);
c.setPrice(50706.2);


t.setLoadCapacity(325);
t.setNo_of_wheels(32);
t.setMake("Volvo");
t.setModel("FH16");
t.setYear(2022);
t.setPrice(324000.67);
c.getDescription();
t.getDescription();
	}

}
