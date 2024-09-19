/* Write java program to demonstrate
 1. No Argument Constructor
---> Create A class Called As Course Name, Create a no argument constructor and display that you are in The_Course_name_constructor
 2. Parameterized Constructor
---> Create A Class named as rectangle, Create 2 Fields for the class rectangle, initialize the values in the constructor and in main display area of the rectangle.
 3. Default constructor
---> Create A class named as square, to create a field using default constructor, access the field and display it.*/

import java.util.Scanner;
class Mycourse
{
	Mycourse()
	{
		System.out.println("My Course is MCA");
	}
}
class Rectangle
{
	int c = 0;
	Rectangle(int a,int b) 
	{
		c = a * b;
		System.out.println("The Area Of Rectangle is:" + c);
	}
}
class Square_1
{
	int l;
}
class ConstructorEx
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter No 1:");
		int a = scn.nextInt();
		System.out.println("Enter No 2:");
		int b = scn.nextInt();
		Mycourse myco = new Mycourse();
		Rectangle rec = new Rectangle(a,b);
		Square_1 sq = new Square_1();
		sq.l = a * a;
		System.out.println(sq.l);
	}	
}