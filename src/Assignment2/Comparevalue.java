package Assignment2;
//4. Write a Java program to test if an string array contains a specific value.
public class Comparevalue {

	public static void main(String[] args) {
		String[]s= {"java","c++","c#","QA","UAT"};
		String find="java";
		boolean check=false;
		for(String element:s) {
			if(element==find) {
				check=true;
				break;
			}
		}
		if(check) {
				System.out.println("we found the string "+find);}
				
			
	else {
	System.out.println("no match found");
	}
		

	}

}
