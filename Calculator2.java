/* Create a class calculator create user defgined functions for addition,subtraction,multiplication,division consider fields to input the values and store the result create an object to display addition, subtraction,multiplication,and division*/

// This first program is nonsense try doing it more difficult

import java.util.Scanner;
class Calculator2
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number 1:");
		float a = scn.nextFloat();
		System.out.println("Enter Number 2:");
		float b = scn.nextFloat();
		Calculator2 calc = new Calculator2();
		calc.addition(a,b);
		calc.subtraction(a,b);
		calc.multiplication(a,b);
		calc.division(a,b);
	}
	int addition(float x,float y)
	{
		System.out.println(x + y);
		return 0;
	}
	int subtraction(float x,float y)
	{
		System.out.println(x - y);
		return 0;
	}
	int multiplication(float x,float y)
	{
		System.out.println(x * y);
		return 0;
	}
	int division(float x,float y)
	{
		System.out.println(x / y);
		return 0;
	}
}