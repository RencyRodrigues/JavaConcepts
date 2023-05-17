package com.practice;

/*2. Write a Java non static method that takes a year from user and print whether that year is a leap year or not 
Expected input - 2016
Expected output - 2016 is a leap year*/
public class Leapyear {
	

	public void leap(int year) { // non static method
		
		//year = 2016;// takes year from user
		if (year % 4 == 0 && year % 100 != 0) { // code to check leap year or not
			System.out.println( year +" "+ "is a leap year");
		} else if (year % 400 == 0) {
			System.out.println( year +" "+ "is a leap year");
		} else {
			System.out.println(year +" "+ "is not a leap year");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leapyear lp = new Leapyear();
		lp.leap(2016);// calling the static method
		lp.leap(2018);
	}

}
