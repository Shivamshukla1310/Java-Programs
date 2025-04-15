// Write a program which takes initial value, final value and step value amd prints a table for farenheit to celcius using -C = (5/9)(F - 32)

import java.util.Scanner;

class Farenheit_To_Celcius{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Initial Value: ");
        int initial = sc.nextInt();
        System.out.print("\nEnter Final Value: ");
        int finals = sc.nextInt();
        System.out.print("\nEnter Step: ");
        int step = sc.nextInt();
        Double celsius = 0D;
        for (int i=initial; i<=finals; i=i+step){
            celsius =((5.0 / 9.0) * (i - 32.0));
            System.out.println(i + "   " + celsius);
        }
    }
} 






















