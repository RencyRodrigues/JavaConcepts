package Assignment2;
//1. Write a Java program to calculate the average value of array elements. Take 10 elements in the array.
public class Average {
	//limitations of array
	//can only store only single data type value i.e we can store int values or double...but cannot store different data
	//type value in single array
	//size of the array is limited
	public static void main(String[] args) {
		int j=0;
		int Num[]={2,5,6,8,9,8,10,20,25,30};//store elements in array type 1
//		int Num[]=new int[10];//declaration of array with elements size of 10
//		Num[0]=1;//store elements in array type 2 
//		Num[1]=2;
//		Num[n-1]=n;
		for(int i=0;i<Num.length;i++) {
			j+= Num[i];
			//System.out.print(Num[i]);// read elements from an array using for loop	
			
			  //System.out.println();
		}
           
		double avg=j/Num.length;
	
//		 
		 System.out.println("average:"+avg);
	
		
		
		}}

