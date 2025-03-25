import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("\nEnter the second string: ");
        String str2 = scanner.nextLine();
        
        String concatenatedString = str1 + str2;
        System.out.println("\nThe concatenated string is: " + concatenatedString);
        
        System.out.print("Enter the starting and ending indices for substring extraction: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        String substring = concatenatedString.substring(start, end);
        System.out.println("\nThe extracted substring is: " + substring);
        
        scanner.close();
    }
}
