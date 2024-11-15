/*Write a program to find out whether a student is pass or fail, if it requires total 40% and at least 33% in each subject to pass.
  Assume 3 subjects and take marks as an input from the user.*/

import java.util.Scanner;

class Question_2
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Marks Of Java:");
		int java = scn.nextInt();
		System.out.println("Enter Marks Of Cpp:");
		int cpp = scn.nextInt();
		System.out.println("Enter Marks Of Python:");
		int py = scn.nextInt();
		int sum = java + cpp + py;
		float per = sum/3;
		if(per >= 80)
		{
			System.out.println("Excellent Work");
		}
		else if(per >= 60 && per <=79)
		{
			System.out.println("Good Work");
		}
		else if(per >= 41 && per <=59)
		{
			System.out.println("Average work");
		}
		else if(per == 40)
		{
			System.out.println("Just Pass")	;
		}
		else
		{
			System.out.println("Fail");
		}	
	}
}