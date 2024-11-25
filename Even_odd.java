/* 1. Input a Range of numbers form the user (eg:1-100) Check wheather the number is even or odd and display it use for loop,while loop and do...while loop
   2. Input he number from the user and display factorial of the number use all three loops
   3. Create a calculator which performs following operations,
	* addition
	* Subtraction
	* Multiplication 
	* Division
	input the number and operation from the user it should be a menu driven program
	*/

import java.util.Scanner;
class Even_odd
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Any Range:");
		int num1 = scn.nextInt();
		/*for(int i=1; i<=num1; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" Is An Even Number");
			}
			else
			{
				System.out.println(i+" Is An Odd Number");
			}
		}*/
		int i = 1;
		/*while(i<=num1)
		{
			if(i%2==0)
			{
				System.out.println(i+" Is An Even Number");
			}
			else
			{
				System.out.println(i+" Is An Odd Number");
			}
			i++;
		}*/
		do
		{
			if(i%2==0)
			{
				System.out.println(i+" Is An Even Number");
			}
			else
			{
				System.out.println(i+" Is An Odd Number");
			}
			i++;
		}while(i<=num1);
	}
}