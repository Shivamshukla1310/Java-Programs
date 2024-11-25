// 2.Write java program to input integers and store it in an array if the numbers are duplicates then an exception must be thrown 

// import java.lang.*;
// import java.util.*;

// class Array_Exception
// {
// 	public static void main(String args[])
// 	{
// 		Scanner sc = new Scanner(System.in);

// 		System.out.print("Enter The Number Of Array:");
// 		int n = sc.nextInt();

// 		int[] arr = new int[n];

// 		for(int i=0; i<n; i++)
// 		{
// 			System.out.print("\n Enter Array Element " + (i+1) + ":");
// 			arr[i] = sc.nextInt();
// 			for(int j=0; j<i; j++)
// 			{
// 				try
// 				{
// 					if(arr[j] == arr[i])
// 					{
// 						throw new ArithmeticException("Duplicates not Allowed");
// 					}
// 				}
// 				catch(Exception e)
// 				{
// 					System.out.print("\n" + e.getMessage());
// 				}
// 			}
// 		}
// 		for(int i=0; i<n; i++)
// 		{
// 			System.out.println(arr[i]);
// 		}
// 	}
// }

import java.util.Scanner;

class Array_Exception {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number Of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            while (true) { // Loop until a valid (non-duplicate) input is provided
                try {
                    System.out.print("\nEnter Array Element " + (i + 1) + ": ");
                    arr[i] = sc.nextInt();

                    // Check for duplicates
                    for (int j = 0; j < i; j++) {
                        if (arr[j] == arr[i]) {
                            throw new ArithmeticException("Duplicates not allowed");
                        }
                    }
                    break; // Exit the loop if no duplicates are found
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage() + ". Please enter a different number.");
                }
            }
        }

        System.out.println("\nArray elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

