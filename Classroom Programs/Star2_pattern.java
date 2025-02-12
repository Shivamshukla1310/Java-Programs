/* Display Following Pattern
     *
    **
   ***
  ****
 *****
 */
import java.util.Scanner;

class Star2_pattern {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = s.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        s.close(); 
    }
}
