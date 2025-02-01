import java.util.Scanner;

class Even_Odd_Using_And
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        int  a = 1;
        if((num & 1) == 1)  // By Using Bitwise And Operator
        {
            System.out.println("Number Is Odd");
        }
        else
        {
            System.out.println("Number Is Even");
        }
    }
}