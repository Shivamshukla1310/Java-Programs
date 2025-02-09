import java.util.*;

class Number_guessing_game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int og_num = rn.nextInt(100) + 1;  // Generates number between 1-100
        int attempt = 0;

        while (true) {
            System.out.println("Enter Your Number (1-100): ");
            int user_input = sc.nextInt();
            attempt += 1;

            if (user_input > 100 || user_input < 1) {
                System.out.println("Sorry, but please enter a number in the range of 1-100. Thank you.");
                continue;  // Skip further checks for invalid input
            }

            if (og_num > user_input) {
                System.out.println("Please enter a higher number.");
            } else if (og_num < user_input) {
                System.out.println("Please enter a lower number.");
            } else {
                System.out.println(" Congratulations! You found the number.");
                break;
            }
        }
        System.out.println("The number of attempts you took was: " + attempt);
        sc.close();  // Close Scanner to prevent resource leak
    }
}
