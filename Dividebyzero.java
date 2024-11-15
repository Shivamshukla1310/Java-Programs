/*Write Java Program To Demonstrate the use of finally block, input 2 number from the user and divide them if the denominator is zero it should throw an exception use finally block to display the denominator should not be zero.*/

import java.util.Scanner;
class Dividebyzero
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No 1:");
		int a = sc.nextInt();
		System.out.print("\n Enter No 2:");
		int b = sc.nextInt();
		int c = 0;
		try
		{
			c = a/b;
		}
		catch(Exception e)
		{
			System.out.print("\nException = " + e);	
		}
		finally
		{
			if(b == 0)
			{
				System.out.print("\nNumber Can't be Divided by Zero, Sorry");
			}
			else
			{ 
				System.out.println("c=" + c);
			}
		}
	}
}

/*Note:-
It is a good practice to use finally block as it can include important code like 
1. Code that might be accidently skipped by return, continue, break.
2. Closing a file or a connection.

There Are Some Cases When Finally Block Does Not Execute:-
1. Use Of System.exit() Method
2. An Exception Occurs In the finally block
3. The Death of the Thread*/
