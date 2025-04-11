import java.util.Scanner;

class Reverse_num{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N:");
        int a = sc.nextInt();
        int rev = 0;
        int temp = a;
        while(temp == 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        System.out.println("Reverse Num: " + rev);
    }
}