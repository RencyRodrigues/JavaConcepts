package com.practice;
import java.util.Scanner;
/*3. Write a Java method to display the multiplication table of a given integer.
Expected output -
5 X 0 = 0                                                                        
5 X 1 = 5                                                                        
5 X 2 = 10                                                                      
5 X 3 = 15                                                                       
5 X 4 = 20                                                                       
5 X 5 = 25...
5 X 10 = 50*/
public class Multiplication {
	int i;
	int j;
	public void multiply() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		j=sc.nextInt();
		sc.close();	
		for (int i = 0; i < 11; i++) {
			System.out.println(j + "x" + i + "=" + i*j);
		}}
	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		m.multiply();			}}
