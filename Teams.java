/*
 *Teams.java
 *4/2/21
 *@author F.Sheridan
 */

 import java.util.Scanner;

 public class Teams{
	 public static void main(String args[]){
		 //Declare variables
		 int numOfStudents, numOfTeams;
		 final int TEAMSIZE = 4;

		 //declare objects
		 Scanner keyboard;

		 //create objects
		 keyboard = new Scanner(System.in);

		 //input
		 System.out.println("Please enter the number of students");
		 numOfStudents = keyboard.nextInt();

		 //process
		 numOfTeams = numOfStudents/TEAMSIZE;

		 //output
		 System.out.println("The number of teams that can be formed is "+numOfTeams);
	 }
 }
