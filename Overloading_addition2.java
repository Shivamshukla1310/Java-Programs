// Write a java program to demonstrate method overloading in terms of passing different types of parameters, create a method named as add in the first method definition // it adds 2 integers and displays the result. in the 2nd method definition it adds two decimal numbers and displays the result.

class Overloading_addition2
{
	public static void main(String args[])
	{
		Overloading_addition2 ad = new Overloading_addition2();
		ad.add(10,20);
		ad.add(10.5f,20.24f,30.22f);
	}

void add(int num1,int num2)
{
	System.out.println(num1+num2);
}
void add(float num1,float num2,float num3)
{
	System.out.println(num1+num2+num3);
}
}