// Use Comparision Operators to find out whether a given number is greater than the user enter number or not.

import java.util.Scanner;
class Question_3
{
	public static void main(String args[])
	{
		int given_num = 10; 
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Your Choice user:");
		int num = scn.nextInt();
		System.out.println(given_num > num);
		System.out.println(given_num < num);
		System.out.println(given_num == num);
	}
}