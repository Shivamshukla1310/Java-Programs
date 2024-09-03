 /* 3. Create a calculator which performs following operations,
	* addition
	* Subtraction
	* Multiplication 
	* Division
	input the number and operation from the user it should be a menu driven program */

import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		System.out.print("Calculator\n");
		Scanner scn = new Scanner(System.in);
		int choice = 0;
		do
		{
			System.out.println("Enter Your Choice:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.End");
			choice = scn.nextInt();
			if(choice <= 4)
			{
				System.out.println("Enter Your First Number:");
				float num1 = scn.nextFloat();
				System.out.println("Enter Your Second Number:");
				float num2 = scn.nextFloat();
				switch(choice)
				{
					case 1:
					{	
						float add = num1 + num2;
						System.out.println(num1 + "+" + num2 + "=" + add);
						break;
					}
					case 2:
					{	
						float sub = num1 - num2;
						System.out.println(num1 + "-" + num2 + "=" + sub);
						break;
					}
					case 3:
					{	
						float mul = num1 * num2;
						System.out.println(num1 + "*" + num2 + "=" + mul);
						break;
					}
					case 4:
					{	
						float div = num1 / num2;
						System.out.println(num1 + "/" + num2 + "=" + div);
						break;
					}
				}
			}
		}while(choice != 5);
		
	}
}