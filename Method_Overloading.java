// Method Overloading

class Method_Overloading
{
	public static void main(String args[])
	{
		Method_Overloading mth = new Method_Overloading();
		mth.display(5);
		mth.display(10,15);
	}
void display(int num1)
{
	System.out.println(num1);
}	

void display(int num1,int num2)
{
	System.out.println(num1 + num2);
}
}