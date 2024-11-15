/* Calculate income tax paid by an employee to the government as per the slabs mentioned below
		Income Slab		Tax
		2.5L-5.0L		5%
		5.0L-10.0L		20%
		Above 10.0L             30%
Note that there is no tax below 2.5L. Take input amount as an input from the user.*/

import java.util.Scanner;

class Question_3
{
	public static void main(String args[])
	{	
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Your Amount:");
		float amount = scn.nextFloat();
		float tax = 0;
		if(amount<250000)
		{
			System.out.println("There is no tax for you");
		}
		else if(amount>=250000 && amount<=500000)
		{
			tax = (amount*5)/100;
			System.out.println("You will have to pay:" + tax + " Rupees To Government");   // For 5% Tax
		}
		else if(amount>=500000 && amount<1000000)
		{
			tax = (amount*20)/100;
			System.out.println("You will have to pay:" + tax + " Rupees To Government");   // For 20% Tax
		}
		else if(amount>=1000000)
		{
			tax = (amount*30)/100;
			System.out.println("You will have to pay:" + tax + " Rupees To Government");    // For 30% Tax
		}
	}
}

