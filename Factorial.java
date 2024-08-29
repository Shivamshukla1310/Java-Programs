// 2. Input he number from the user and display factorial of the number use all three loops

import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Any Numnber:");
		int num1 = scn.nextInt();
		int facto = 0;
		int i = 1;
		/*for(int i=1; i<=num1; i++)
		{
			int fact = i * num1;
			facto = fact * num1;
		}
		System.out.println("Factorial of "+num1+ " is" + facto);*/
		while(i<=num1)
		{
			int fact = i * num1;
			facto = fact * num1;

		}
		System.out.println("Factorial of "+num1+ " is" + facto);
	}
}