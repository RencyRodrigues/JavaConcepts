package com.practice;
/*5. Write a Java method to get no. of marks in integer got by a student and print the grades
Conditions for marks and grades
more than 90 - A
80 -90 -> B
68- 79 -> C
55 - 67 -> D
40 - 54 -> E
less than 40 - Fail
any number outside 0 to 100 -> invaid marks

Expected Input -  Marks attained by student is 75
Expected output - Grade attained is - C*/
public class Grades {
	double marks;
	public void levels(double marks) {
		if (marks > 90 && marks < 100) {
			System.out.println("A");
		} else if (marks <= 90 && marks >= 80) {
			System.out.println("B");
		} else if (marks <= 79 && marks >= 68) {
			System.out.println("C");
		} else if (marks <= 67 && marks >= 55) {
			System.out.println("D");
		} else if (marks <= 54 && marks >= 40) {
			System.out.println("E");
		} else if (marks < 40 && marks > 0) {
			System.out.println("Fail");}
		else {
			System.out.println("invalid marks");
		}}
	public static void main(String[] args) {
		Grades g = new Grades();
		g.levels(95);// A
		g.levels(20);// fail
		g.levels(120);// invalid marks
		g.levels(-10);// invalid marks
		g.levels(55.78);// D
		g.levels(75);// C
		g.levels(90);// B
	}

}
