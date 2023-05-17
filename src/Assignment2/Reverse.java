package Assignment2;
//Write a Java program to reverse an array of integer values.
public class Reverse {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5};
		for(int j=0;j<num.length;j++) {
			System.out.print(+num[j]);	
		}
		System.out.println("");
		System.out.println("reverse number is:");
		for(int i=0;i<num.length;i++) {		
			num[i]=num.length-i;
			System.out.print(+num[i]);
		}

	}

}
