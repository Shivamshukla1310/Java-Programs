/*A small airline has just purchased a computer for its new automated reservation system. you have been asked to develop the new system, you are suppose to write an application to assign seats on each flight of the airlines only plane (capacity 10 seats).
your application should display the following alternatives:
1. please type 1 for 1st class
2. type 2 for economy class
3. if the user types 1 your application should assign seat in the first class section (1-5)
4. if the user types 2 your application should assign seat in the economy section (6-10)
5. your application should display a boarding pass indicating the persons seat no. and weather it's in the 1st class or economy section
6. use 1D array of primitive type Boolean to represent the seating chart of the plan
7. initialize all the elements of the array to false to indicate that all seats are empty
8. as each seat is assigned set the corresponding element of the array to true to indicate the seat is not available
9. your application should never assign a seat that has been already assigned. when the economy section is full your application should ask the person if its acceptable to be placed in the 1st section and vice versa. if yes make the appropriagte seat assignment.if no display the message 'next flight leaves in 3 hrs'*/


import java.util.Scanner;

class Indigo_airlines
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\t\t\tIndigo Airlines Services PVT LTD");
		System.out.print("\n\t\t\t--------------------------------");
		System.out.print("\n\n Enter 1 For First Class Booking Or 2 For Economy Class:");
		int select = sc.nextInt();
		boolean[] seat = new boolean[select];
		Selection(select);
	}

	static void Selection(int a)
	{
		if(a == 1)
		{
			System.out.print("\n\n Your Booking Will Be Done In First Class.");

		}
		else if(a == 2)
		{
			System.out.print("\n\n Your Booking Will Be Done In Economy Class.");
		}
		else
		{
			System.out.print("\n\n Wrong Number Selected, Please Select 1 Or 2");
		}
	}
}



