
import java.util.Scanner;

public class ArrayPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int N = scanner.nextInt();
        
        int[] array = new int[N];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("The elements in the array are:");
        for (int i = 0; i < N; i++) {
            System.out.println(array[i]);
        }

        scanner.close();
    }
}
