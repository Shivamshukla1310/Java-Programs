/* Write java program to throw an arithmatic exception displaying students age is not correct if the students age is below 18 it should throw an exception 
*/

import java.lang.*;
import java.util.*;
class MyFirstException
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int a = sc.nextInt();
		if(a  < 18)
		{
			System.out.print("\n You are Not Eligible");
			throw new ArithmeticException("try Again");
		}
		else
		{
			System.out.print("\n Enter Now");
		}
	}
}
