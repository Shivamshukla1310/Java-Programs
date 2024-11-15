// Write a java program to find out the day of the week given the number[1 fo monday, 2 for Tuesday and so on...!]

import java.util.Scanner;
class Question_4
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number From 1-7:");
		int week = scn.nextInt();
		switch(week)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
		}
	}
}