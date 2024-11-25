/*Looping Statements
---> When you wan to repeat a block of code several times Than you use looping statements
---> In Java we have following looping statements
1. For loop
2. While loop
3. Do...while loop

							For Looping Statement
Syntax:-

for(initialization; condition; increment/decrement)
{
	.
	.
	.
	Statement block
}

Example:- Display the numbers starting from 1 to 5.
	  Display good morning 5 times.*/

import java.util.Scanner;

class For_loop_prg
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Number You want to print till:");
		int num1 = scn.nextInt();
		for(int i=1; i<=num1; i++)
		{
			// System.out.println(i);
			System.out.print(i+". Aur Bhaiyaji Su Prabhat\n");
		}
	}
}