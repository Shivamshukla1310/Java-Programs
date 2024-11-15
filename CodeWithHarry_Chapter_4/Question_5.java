// Write a java program to whether a year entered by the user is a leap year or not

import java.util.Scanner;

class Question_5
{
	public static void main(String args[])
	{	
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Your Year:");
		int year = scn.nextInt();
		if(year % 4 == 0)
		{
			System.out.println("It Is Leap Year.");
		}
		else
		{
			System.out.println("Its Not Leap Year.");
		}
	}
}