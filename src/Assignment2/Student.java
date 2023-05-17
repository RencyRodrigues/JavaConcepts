package Assignment2;
//8. Create a student class having variables as first name, middle name, last name and suffix (e.g. - Jr. , Sr. I , II). 
//Create a method Displayname, and demonstrate method overloading.
//It should have scenarios - 
//First name + last name
//First name + middle name + last name
//First name + middle name + last name + suffix
//First name  + suffix
public class Student {
	String Fname;
	String Mname;
	String Lname;
	String Suffix;
	public void displayname(String Fname,String Lname) {
		System.out.println("First Name: "+Fname);
		System.out.println("Last Name: "+Lname);
	}
	public void displayname(String Fname,String Mname,String Lname) {
		System.out.println("Full Name: "+Fname+" "+Mname+" "+Lname);
		
	}
	public void displayname(String Fname,String Mname,String Lname,String Suffix) {
		System.out.println("Full Name: "+Fname +" "+Mname +" "+Lname +","+Suffix);
		
	}
	public void displayname(String Fname,char Suffix) {
		System.out.println("Full Name: "+Fname+Suffix);
		
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.displayname("David","smith");
		s.displayname("David","john","smith");
		s.displayname("David","john","smith","jr");
		s.displayname("John ",'I');

	}

}
