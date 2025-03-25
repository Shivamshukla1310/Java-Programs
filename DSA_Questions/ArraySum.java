import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int N = scanner.nextInt();
        
        int[] array = new int[N];
        int sum = 0;

        System.out.println("Enter " + N + " elements:");
        for (int i = 0; i < N; i++) {
            System.out.println("Element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        System.out.println("The sum of the array elements is: " + sum);

        scanner.close();
    }
}
