
class Time_Complexity_Program
{
	public static void main(String args[])
	{
        	//methodToBeTimed();
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age:");
		int age = sc.nextInt();
		int choice;
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					Best_case(age);
					break;
				case 2:
					Average_case(age);
					break;
				case 3:
					Worst_case(age);
					break;
				default:
					System.out.println("Sorry Wrong input");	
					break;
			}*/

	Best_case(21);
	Average_case(21);
	Worst_case(21);
	}
		
	public static void Best_case(int a)
	{
		double startTime = System.nanoTime();
		System.out.println(a >= 18 ? "You Are Eligible" : "You Are Not Eligible"); 
		double endTime = System.nanoTime();
        double duration = (endTime - startTime);
        System.out.println("Execution time in nanoseconds: " + duration);
	}
	
	public static void Average_case(int a)
	{
		double startTime = System.nanoTime();
		if(a >= 18)
		{
			System.out.println("You Are Eligible To Vote.");
		}
		else
		{
			System.out.println("You Are Not Eligible To Vote.");
		}
		double endTime = System.nanoTime();
        double duration = (endTime - startTime);
        System.out.println("Execution time in nanoseconds: " + duration);
	}

	public static void Worst_case(int a)
	{
		double startTime = System.nanoTime();
		switch(a)
		{
			case 0:
				System.out.println("You Are Not Eligible.");
			case 1:
				System.out.println("You Are Not Eligible.");
			case 2:
				System.out.println("You Are Not Eligible.");
			case 3:
				System.out.println("You Are Not Eligible.");
			case 4:
				System.out.println("You Are Not Eligible.");
			case 5:
				System.out.println("You Are Not Eligible.");
			case 6:
				System.out.println("You Are Not Eligible.");
			case 7:
				System.out.println("You Are Not Eligible.");
			case 8:
				System.out.println("You Are Not Eligible.");
			case 9:
				System.out.println("You Are Not Eligible.");
			case 10:
				System.out.println("You Are Not Eligible.");
			case 11:
				System.out.println("You Are Not Eligible.");
			case 12:
				System.out.println("You Are Not Eligible.");
			case 13:
				System.out.println("You Are Not Eligible.");
			case 14:
				System.out.println("You Are Not Eligible.");
			case 15:
				System.out.println("You Are Not Eligible.");
			case 16:
				System.out.println("You Are Not Eligible.");
			case 17:
				System.out.println("You Are Not Eligible.");
			default:
				System.out.println("You Are Eligible.");
		}
		double endTime = System.nanoTime();
        double duration = (endTime - startTime);
        System.out.println("Execution time in nanoseconds: " + duration);
	}

}