// Write java program to input 10 integer value and store it in the array, also display those value.

import java.util.Scanner;
class Array_method
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0; i<10; i++)
		{
			System.out.println("Enter Your number " + i + ":");
			arr[i] = scn.nextInt();
		}
		for(int j=0; j<arr.length; j++)
		{
			System.out.println(j);
		}
	}
}
