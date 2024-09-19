
// Write a java prg to convert a string to lowercase
import java.util.Scanner;
class Lower_Upper
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter ANy String:");
        String name = scn.next();
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }
}