// Write a java program to input 10 integer numbers calculate the sum of 10 numbers and display it

import java.util.Scanner;
class Array_Sum
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[10];
		int sum = 0;
		for(int i=0; i<10; i++)
		{
			System.out.println("Enter Your number " + i + ":");
			arr[i] = scn.nextInt();
		}
		for(int j=0; j<arr.length; j++)
		{
			System.out.println(arr[j]);
			sum = sum + arr[j];
		}
		System.out.println("\nThe Sum Is:" + sum);
	}
}