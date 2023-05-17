package com.practice;



public class Practice {
		
		
		public void m1(String Day) {
			
			switch (Day) {
			case "Monday":
				System.out.println("The day count entered is 1 and the day is Monday");
				break;
			case "Tuesday":
				System.out.println("The day count entered is 2 and the day is Monday");
				break;
				
			case "Wednesday":
				System.out.println("The day count entered is 3 and the day is Monday");
				break;
				
			case "Thrusday":
				System.out.println("The day count entered is 4 and the day is Monday");
				break;
			case "Friday":
				System.out.println("The day count entered is 5 and the day is Monday");
				break;
			case "Saturday":
				System.out.println("The day count entered is 6 and the day is Monday");
				break;
			case "Sunday":
				System.out.println("The day count entered is 7 and the day is Monday");
				break;
				default:
					System.out.print("Day do not match");
			}
				
			}
			public void m1(int count) {
				
				switch(count) {
				case 1:
					System.out.println("The day count entered is 1, the day is Monday");
					break;
				case 2:
					System.out.println("The day count entered is 2 , the day is Monday");
					break;
					
				case 3:
					System.out.println("The day count entered is" +count+" the day is Monday");
					break;
					
				case 4:
					System.out.println("The day count entered is " +count+"the day is Monday");
					break;
				case 5:
					System.out.println("The day count entered is " +count+" the day is Monday");
					break;
				case 6:
					System.out.println("The day count entered is " +count+" the day is Monday");
					break;
				case 7:
					System.out.println("The day count entered is " +count+"the day is Monday");
					break;
					default:
						System.out.print("Day do not match");
					
					
				}
				
			
			}
			
		
		public static void main(String[] args)
		{
			Practice L=new Practice();
			L.m1("Monday");
			L.m1(1);
			L.m1(0);
			
		}
		
	

		
		
	}