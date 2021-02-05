/*
 *Sum.java
 *@author F.Sheridan
 *2/2/2021
 */

 import java.util.Scanner;//import the scanner class

 public class Sum{
	 public static void main(String args[]){

		 //declare variables
		 int num1;
		 int num2;
		 int sum;

		 //declare objects
		 Scanner keyboard;

		 //create objects
		 keyboard = new Scanner(System.in);

		 //input
		 System.out.println("Please enter first number");
		 num1 = keyboard.nextInt();
		 System.out.println("Please enter next number");
		 num2 = keyboard.nextInt();

		 //compute (process)
		 sum = num1 + num2;

		 //output
		 System.out.println("The sum of those numbers is "+ sum);
	 }
 }

