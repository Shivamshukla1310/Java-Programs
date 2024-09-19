// Write a program to input elements in the array check whether the numbers are even or odd and then store the even numbers in the second array
import java.util.Scanner;

class Find_even_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];  
        int even[] = new int[n]; 
        int evenCount = 0;       
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 == 0) {   
                even[evenCount] = arr[j];  
                evenCount++;
            }
        }
        System.out.println("Even numbers in the array:");
        for (int k = 0; k < evenCount; k++) {
            System.out.print(even[k]+" ");
        }
    }
}
