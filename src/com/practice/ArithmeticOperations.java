package com.practice;

import java.util.Scanner;

/*4. Write a Java program that accepts two integers and then prints the sum, the difference, the product,
 *  the average,  the maximum (the larger of the two integers), the minimum (smaller of the two integers). 
 *  sAll these functions should be a separate method

Test Data
Input 1st integer: 25
Input 2nd integer: 5
Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Larger number is: 25
Smaller number is:5*/
public class ArithmeticOperations {
	
	public void sum(int i,int j) {
		
		System.out.println("sum of two integers:" + (i+j));
	}
	//difference of two numbers
	public void difference(int i,int j) {
	
		System.out.println("Difference of two integers:" + (i - j));
	}
	//product of two numbers
	public void product(int i,int j) {
		
		System.out.println("Product of two integers:" + (i * j));
	}
	//average of 2 numbers
	public void average(int i,int j) {
		
		System.out.println("Average of two integers:" + (i + j) / 2);
	}
public void large_small(int i,int j) {
		
		// System.out.println("Average of two integers:"+k);
		if (i > j) {
			System.out.println("Larger number is:" + i);
			System.out.println("Smallest number is:" + j);
		}
			else if(j>i){
			 System.out.println("Smallest number is:" + i);
		 
			 System.out.println("Larger number is:" + j);}
			 	
		else System.out.println("number is equal");
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOperations ao = new ArithmeticOperations();
		
		ao.sum(4,5);
		ao.difference(9,8);
		ao.product(3, 8);
		ao.average(7,8);
		ao.large_small(13,30);
	}

}
