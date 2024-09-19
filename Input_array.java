// write a java program to input array element and display cubic addition

import java.util.Scanner;

class Input_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0; i<n; i++)
        {
            System.out.println("Enter Element " + i + ":");
            arr[i] = sc.nextInt();
        }
        int cubic_sum = 0;
        for (int i=0; i<arr.length; i++)
        {
            cubic_sum += Math.pow(arr[i], 3);
        }
        System.out.println("Cubic_Sum:" + cubic_sum);
    }
}
