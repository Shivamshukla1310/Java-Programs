// Program To Perform Recursion Using Function 

import java.util.Scanner;

class Recursion_factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		int num = sc.nextInt();
		int result = Method_recursion(num);
		System.out.println("Result= " + result);
	}
	public static int Method_recursion(int number)
	{
		if (number == 1)
		{
			return 1;
		}
		else
		{
			return number * Method_recursion(number - 1);
		}
	}

}