// // This Method Was Proposed By Mohit Sir 
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Scanner;

// class Mohit_sir_question{
//     public static void main(String args[]){
//         String[] s1 = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
//         Scanner s = new Scanner(System.in);
//         ArrayList a1 = new ArrayList();
//         System.out.println("Enter The Number: ");
//         int num = s.nextInt();
//         int re = 0;
//         while(num != 0){
//             re = num % 10;
//             a1.add(s1[re]);
//             num /= 10;
//         }
//         Collections.reverse(a1);
//         for (Object s2:a1){
//             System.out.print(s2 + " ");
//         }
//     }
// }

import java.util.Scanner;
//import java.util.lang;
class Mohit_sir_question{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] s1 = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.print("Enter Any Number You Wish: ");
        String n = sc.nextLine();
        char r;
             for(int i = 0; i <= n.length() - 1; i++){
                r = n.charAt(i);
                for(int j = 0; j <= s1.length -1; j++){
                    if((r - '0') == j){   // Based On Ascii Value As It Only Works For Digit Between 0-9.
                        System.out.print(s1[j] + " ");
                    }
                }
            }
        }
    }

// I will Come Back To This Problem With A Better Way To Solve It