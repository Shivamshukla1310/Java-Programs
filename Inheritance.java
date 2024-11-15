class parent
{
	int n1=10;
	void displayp()
	{	
		System.out.println("Mein Baap Hun");
	}  
}   								// Parent Class

class child extends parent
{
	int n2=20;
	void displayc()
	{
		System.out.println("Mein Unka Beta");
	}
}								// Child Class

class Inheritance
{
	public static void main(String args[])
	{
		child c = new child();
		c.displayp();
		c.displayc();
	}
}