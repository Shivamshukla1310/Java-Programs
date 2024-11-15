import java.util.Scanner;

class Sum_numbers
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter N:");
		int n = scn.nextInt();
		int sum = 0;
		for(int i=0; i<=n; i++)
		{
			System.out.println("Enter Value " + i + ":");
			int s = scn.nextInt();
			sum = sum + s;
		}
		System.out.println(sum);
	}
}