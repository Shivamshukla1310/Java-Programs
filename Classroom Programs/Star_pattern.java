/* Display Following Pattern
*
**
***
****
*****
 */
import java.util.Scanner;
class Star_pattern
{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number OF Lines: ");
        int n = s.nextInt();
        for(int i = 0; i <= n-1; i++)
        {
            for(int j = 0; j <=i; j++)
            {
                System.out.print("*   ");
            }
            System.out.print("\n");
        }
    }
}