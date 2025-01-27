// Convert String To a Palindrome String 

import java.io.*;
import java.util.*;
public class Palindrome_string {
    public static boolean isPalindrome(String s) {
       s = s.toLowerCase();
       String rev = "";
       for(int i = s.length() - 1; i >= 0; i--)
       {
           rev = rev + s.charAt(i);
       }
        // Your code here
        
        return s.equals(rev); // Placeholder return statement - You are required to change this
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter your string: ");
        String s = sc.nextLine();
        boolean res = isPalindrome(s);
        if(res)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}