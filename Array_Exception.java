// 2.Write java program to input integers and store it in an array if the numbers are duplicates then an exception must be thrown 

import java.lang.*;
import java.util.*;

class Array_Exception
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Number Of Array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<n; i++)
		{
			System.out.print("\n Enter Array Element " + (i+1) + ":");
			arr[i] = sc.nextInt();
			for(int j=0; j<i; j++)
			{
				try
				{
					if(arr[j] == arr[i])
					{
						throw new ArithmeticException("Duplicates not Allowed");
					}
				}
				catch(Exception e)
				{
					System.out.print("\n" + e.getMessage());
				}
			}
		}
	}
}
