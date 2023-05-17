package com.practice;
/*6. Write a Java program to calculate the area and perimeter of a rectangle, square and circle based using switch statement.
use choice variable for selection
1 - Area of Rectangle length*width
2 - Perimeter of Rectange 2(length+width)
3 - Area of Square side^2
4 - Perimeter of Square Area of square * area of square
5 - Area of Circle pi*r^2
6 - Perimeter of Circle 2*pi*r
any other value - Invaild choice
*/
public class Formula {
	public void shapes(int Area) {
		int length = 10;
		int width = 20;
		int side = 44;
		double radius = 5;
		switch (Area) {
		case 1:
			System.out.println("Area of rectangle is:" + (length * width));
			break;
		case 2:
			System.out.println("Perimeter of rectangle:" + 2 * (length + width));
			break;
		case 3:
			System.out.println("Area of a square is:" + (side * side));
			break;
		case 4:
			System.out.println("Perimeter of a square is:" + (4 * side));
			// System.out.println("Area of a square is:"+Math.pow(side,2));//second way of calculating area of square
			break;
		case 5:
			System.out.println("Area of a circle is:" + Math.PI * Math.pow(radius, 2));
			break;
		case 6:
			System.out.println("Perimeter of a circle:" + 2 * Math.PI * radius);
			break;
		default:
			System.out.println("invalid choice");
		}}
	public static void main(String[] args) {
		Formula f1 = new Formula();
		f1.shapes(1);// Area of rectange is:200
		f1.shapes(6);// Perimeter of a circle:31.41592653589793
		f1.shapes(0);// invalid choice
	}}
/*
 * Expected input : 1 Expected output : Area of rectange is XX Expected input :
 * 6 Expected output : Perimeter of circle is XX Expected input : 0 Expected
 * output : Invaild choice
 */
