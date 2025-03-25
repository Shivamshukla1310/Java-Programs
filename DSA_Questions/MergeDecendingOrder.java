import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the arrays:\n");
        int n = scanner.nextInt();
        
        Integer[] array1 = new Integer[n];
        Integer[] array2 = new Integer[n];
        
        System.out.print("Enter elements for the first array:\n");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ":\n");
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter elements for the second array:\n");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ":\n");
            array2[i] = scanner.nextInt();
        }

        Integer[] mergedArray = new Integer[2 * n];
        System.arraycopy(array1, 0, mergedArray, 0, n);
        System.arraycopy(array2, 0, mergedArray, n, n);

        Arrays.sort(mergedArray, Collections.reverseOrder());

        System.out.print("Merged array sorted in descending order: [");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i]);
            if (i < mergedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");

        scanner.close();
    }
}
