// Write a java program to demonstrate method overloading in terms of passing different parameters, create a function named as add it should be called twice with differing number of parameters to display addition of integers.

class Overloading_addition
{
	public static void main(String args[])
	{
		Overloading_addition ad = new Overloading_addition();
		ad.add(10,20);
		ad.add(10,20,30);
	}

void add(int num1,int num2)
{
	System.out.println(num1+num2);
}
void add(int num1,int num2,int num3)
{
	System.out.println(num1+num2+num3);
}
}