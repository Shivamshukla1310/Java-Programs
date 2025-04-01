import java.util.Scanner;

class convertBinaryTodecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int num = sc.nextInt();  // Take binary number input

        int decimalNumber = 0;
        int i = 0;
        int remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            i++;
        }

        System.out.println("Decimal equivalent: " + decimalNumber);
        sc.close();
    }
}
