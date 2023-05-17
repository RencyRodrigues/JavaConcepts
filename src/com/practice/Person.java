package com.practice;
/*1. Write a Java program to create a class called "Person" with a first name, last name, age, country of residence, Employment status attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print the person info
Expected output -
Person name is - John Doe
John's age is 35
John resides in Canada
John is working Full time at ABC company*/

public class Person {
	String first_name = "john's";
	String last_name;
	int age;
	String country;
public Person(String first_name,String last_name) {
	System.out.println("person name is" + " " + first_name + " " + last_name);
	
}

public Person(int age, String Country) {
	System.out.println(first_name + " " + "age is" + " " + age);
	
			System.out.println(first_name + " " + "Resides in " + " " + Country);
			System.out.println("John is working Full time at ABC company");
//			if (age >= 35)
//				System.out.println("John is working Full time at ABC company");
//			else
//				System.out.println("John is working part time at ABC company");
//	
}
//	public void person_Name(String first_name, String last_name) {
//
//		System.out.println("person name is" + " " + first_name + " " + last_name);
//	}
//
//	public void Person_detail(int age, String Country) {// non static method
//		System.out.println(first_name + " " + "age is" + " " + age);
//
//		System.out.println(first_name + " " + "Resides in " + " " + Country);
//		if (age >= 35)
//			System.out.println("John is working Full time at ABC company");
//		else
//			System.out.println("John is working part time at ABC company");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person("John","Doe");// obj 1
		Person obj1 = new Person(35,"Canada");


	}

}
