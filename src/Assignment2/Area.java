package Assignment2;
//9. Create a class named Area and have variables as Length, Breadth, radius. create methods to calculate area of Square, 
//Rectangle, Circle with arguments having return type as int, double for each to demonstrate method overloading.
//Overall 6 methods - 2 each for Square, Rectange, Circle. 1 method with int return type and 1 for
// double return type of arguments
public class Area {
double length;
double breath;
double radius;
double side;
	public int square(int side) {
		int area=side*side;
		System.out.println("area of a square is: "+area);
		return area;
	}
	public double square(double side) {               //method overloading for square
		double area=side*side;
		System.out.println("area of a square is: "+area);
		return area;
	}
	public int rectangle(int length,int breadth) {
		int area=length*breadth;
		System.out.println("area of a Rectangle is: "+area);
		return area;
	}
	public double rectangle(double length,double breadth) {  //method overloading for rectangle
		double area=length*breadth;
		System.out.println("area of a Rectangle is: "+area);
		return area;
	}
	public int circle(int radius) {
		int area=(int) (Math.PI * Math.pow(radius, 2));
		System.out.println("area of circle: "+area);
		return area;
	}
	public double circle(double radius) {                    //method overloading for circle
		double area=(double) (Math.PI * Math.pow(radius, 2));
		System.out.println("area of circle: "+area);
		return area;
	}
	
	
	public static void main(String[] args) {
		Area a=new Area();
		System.out.println("==================================");
		a.square(5);
		a.square(7.1);
		System.out.println("==================================");
		a.rectangle(4,5);
		a.rectangle(21.5,7);
		System.out.println("==================================");
		a.circle(6);
		a.circle(7.843);
		System.out.println("==================================");
	}

}
