// // This Program Is Used to check weather the number is prime or not

// import java.util.Scanner;

// class Prime_number{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your Number: ");
//         int num = sc.nextInt();
//         int count = 0;
//         for(int i=2; i<=num; i++){
//             if(num % i == 0){
//                 count = count + 1;
//             }
//         }
//         System.out.println(((count > 1) ? "Your number is not prime" : "Your number is prime")); 
//     }
// }

import java.util.Scanner;

class Prime_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num == 2 || num == 3 || num == 5 || num == 7){
            System.out.println("Its prime");
        }
        else if((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0) || (num % 7 == 0)){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Its Prime");
        }
    }
}