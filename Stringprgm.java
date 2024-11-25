/*Strings In Java

--> In java a string is a sequence of characters we use double quotes to represent a string in java one of the ways to create a string is:-

String Varname = "Hello";

--> In Java Strings Are immutable, that means that wr cannot change the strings once it is created*/

public class Stringprgm {
    public static void main(String[] args) {
        String str="java programming";//first way
        String str1= new String();//second way
        str1="Good morning";
	str1="Ajinkya";
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str +" " +str1);
        int len=str.length();
        System.out.println(len);
        String concatenate= str.concat(str1);
	System.out.println(str.equals(str1));
        System.out.println(concatenate);
    }
}

/*We have created a string directly like a primitive datatype however we can also create a string using new keyword...
  Strings in java are not primitive data types instead all strings are objects of a pre-defined class named as String and all string variables are instances of string class 

Java String Operations
--> Java Provides various string methods to perform different operations on strings following art commonly used string operations
1. to get the length of string we use length() method. 
2. to join strings we use concat() method. We can also concatinate or join strings by using "+" Operator.
3. To compare 2 strings in java we can make comparision between 2 strings using equals() method, When The strings are equal the result is true and otherwise the result is false, We can also compare 2 string by using == operator */