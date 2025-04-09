import java.util.Scanner;

class Simple_intrest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        float p = sc.nextFloat();
        System.out.print("Enter rate of intrest: ");
        float r = sc.nextFloat();
        System.out.print("Enter years: ");
        int n = sc.nextInt();
        float si = (p*r*n) / 100;
        System.out.println(si);
    }
}