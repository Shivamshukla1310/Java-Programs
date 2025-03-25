import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class StringPermutations {
    public static void generatePermutations(String str, String perm, ArrayList<String> result) {
        if (str.isEmpty()) {
            result.add(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            generatePermutations(str.substring(0, i) + str.substring(i + 1), perm + str.charAt(i), result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (max length 8 characters): ");
        String input = scanner.nextLine();
        
        if (input.length() > 8) {
            System.out.println("Error: String length exceeds 8 characters.");
        } else {
            ArrayList<String> permutations = new ArrayList<>();
            generatePermutations(input, "", permutations);
            System.out.println("\nAll permutations of the string:");
            for (String perm : permutations) {
                System.out.println(perm);
            }
        }
        scanner.close();
    }
}
