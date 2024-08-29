/*Switch statement
--> If we have more than one alternative instead of using complicated if...else statement we use switch statement.
Syntax:-
	Switch(__){
		case 1: 
		.			So basically Rather than using complicated if...else statement if you have many,
		.			Conditions you can use switch..case statement as it is easy to use and less 
		break;			complicated.
		case 2:
		.
		.
		break;
		default:
		.
		.
	}

Example:- Input a number from a user, if a number equals to 3 then display it in words other wise display number doesn't exist.*/

import java.util.Scanner;
class Switch_prg
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Any Number b/w 1-3 only:");
		int num1 = scn.nextInt();
		switch(num1)
		{
			case 1:
				System.out.println("Ek Number");
				break;
			case 2:
				System.out.println("Do Number");
				break;
			case 3:
				System.out.println("Teen Number");
				break;
			default:
				System.out.println("Khatam Bhai/Behen YE Number Toh nai hai...");
		}
	}
}