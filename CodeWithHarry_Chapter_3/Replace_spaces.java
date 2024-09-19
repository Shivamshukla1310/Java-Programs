// Write a program to replace spaces with underscores
import java.util.Scanner;
class Replace_spaces
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The String:");
        String name = scn.next();
        System.out.println(name.replace("_", " "));
    }
}