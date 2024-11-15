// 1.Write Java Program to create a method that takes an integer as a parameter and throws an exception if the number is odd 

import java.lang.*;
class Odd_Exception
{
	public class Odd
	{
		static void Odd_method(int a)
		{
			if(a % 2 != 0)
			{
				throw new ArithmeticException("This Is Odd Number");
			}
			else
			{
				System.out.print("This Is Even Number");
			}
		}
	}
	public static void main(String agrs[])
	{
		// Odd o = new Odd();
		Odd.Odd_method(6);
	}
	
}