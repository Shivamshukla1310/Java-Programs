import java.util.*;

class Overloading{
    public void sum(int a, int b){
        int add = a + b;
        System.out.println("add: " + add);
    }

    public void sum(int l, int m, int n){
        int multiply = l * m * n;
        System.out.println("Multy: " + multiply);
    }

    public void sum(float i, float j){
        float divide = i / j;
        System.out.println("divide: " + divide);
    }

    public void sum(int o, float p){
        float sub = o - p;
        System.out.println("Sub: " + sub);
    }
}


class Polymorphism{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Overloading ov = new Overloading();
        System.out.print("Enter Your int num 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Your int num 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter Your int num 3: ");
        int num3 = sc.nextInt();
        System.out.print("Enter Your float num 1: ");
        float fnum1 = sc.nextFloat();
        System.out.print("Enter Your float num 2: ");
        float fnum2 = sc.nextFloat();
        ov.sum(num1, num2);
        ov.sum(fnum1,fnum2);
        ov.sum(num1,fnum1);
        ov.sum(num1,num2,num3);
    }
}
