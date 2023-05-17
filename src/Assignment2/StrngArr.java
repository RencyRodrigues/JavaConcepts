package Assignment2;
//3. Write a Java program to print a 2D string array in console of size 4*5
public class StrngArr {

	public static void main(String[] args) {
		String[][] arr= {{"First_name","Middle_name","Last_name","Country","Course"},
				{"David","john","Smith","Canada","JAVA"},
				{"Kia","Tim","wan","USA","QA"},{"Shara","Loui","Matt","UK","UAT"}};
	//System.out.println("length of an array:"+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println();
			System.out.println();
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+" ");
				System.out.print("");
			}
			
		}
	}}
	