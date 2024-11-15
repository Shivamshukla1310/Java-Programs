// to print sum of cubic values store in am array 

import java.util.Scanner;

class Cubic_array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int i=1; i<=9; i++)
        {
            System.out.print("Enter Number:");
            a[i] = sc.nextInt();
        }
        System.out.print("Array:" + a);
    }
}