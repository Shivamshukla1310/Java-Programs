// Program to find Vowel From The string

import java.util.Scanner;
class Find_Vowel
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your String:");
		String name = sc.nextLine();
		int num = 0;
		for(int i=0; i<name.length(); i++)
		{
			char ch = name.charAt(i);
			if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') 
				{
					System.out.println(i + ": " + ch);
					num = num + 1;
				}
		}
		System.out.println("\n Total Number OF Vowel In String: " + num);
	}
}