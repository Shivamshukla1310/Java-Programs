/* Write java program to create 2 string use menu driven approach to perform the following 
1. Display length of both strings
2. To concatenate both strings 
3. To compare both strings
*/

import java.util.Scanner;
class Menu_Driven_Method
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String 1:");
		String s1 = sc.nextLine();
		System.out.print("\n Enter String 2:");
		String s2 = sc.nextLine();
		int a = 0;
		do
		{
			System.out.print("\n 1.String Length\n2. Concate 2 Strings\n3. Compare 2 String\nEnter Your Choice:");
			a = sc.nextInt();
			switch(a)
			{
				case 1:
				{
					System.out.println(s1.length() + " " + s2.length());
					break;
				}
				case 2:
				{
					System.out.println(s1.concat(s2));
					break;
				}
				case 3:
				{
					System.out.println(s1.equals(s2));
					break;
				}
			}
		}while(a != 4);
	}
}