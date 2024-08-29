/* Input the day number from the user if user inputs number 1 then display Monday and vice versa till 7 Otherwise display day number doen't exist 
   Use Switch...case For this program*/

import java.util.Scanner;
class Switch_prg2
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Any Number b/w 1-7 only:");
		int num1 = scn.nextInt();
		switch(num1)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;

			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Esa Number Wala Week Ij Nai Hai Biddu.");


		}
	}

}
