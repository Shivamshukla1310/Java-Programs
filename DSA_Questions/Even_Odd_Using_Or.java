import java.util.Scanner;

class Even_Odd_Using_Or
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        int  a = 1;
        if((num | 1) > num)  // By Using Bitwise And Operator
        {
            System.out.println("Number Is Even");
        }
        else
        {
            System.out.println("Number Is Odd");
        }
    }
}       