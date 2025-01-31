import java.util.Scanner;

class Even_odd_with_XOR
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Num: ");
		int num = sc.nextInt();
		int a = 1;
		if((num ^ a) == (num+1))
		{
			System.out.print("\n Even");
		}
		else
		{
			System.out.print("\n Odd");
		}
	}
}