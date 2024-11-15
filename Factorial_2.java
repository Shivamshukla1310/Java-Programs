// Take input from the user and based on that perform Factorial program
// 5! = 5 * 4 * 3 * 2 * 1

import java.util.Scanner;

class Factorial_2
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your number:");
		int n = scn.nextInt();
		int f = 1;
		for(int i = 1; i <= n; i++)
		{
			f = f * i;
		}
		System.out.print("Your Factorial Is:" + f);
	}
}