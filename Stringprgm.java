/*

Strings In Java

--> In java a string is a sequence of characters we use double quotes to represent a string in java one of the ways to create a string is:-

String Varname = "Hello";

--> In Java Strings Are immutable, that means that wr cannot change the strings once it is created
Java Virtual Machine Creates A New String Instead Of Reassigning a different value to the existing string

We have Seen how to create strings using string literals and new keyword, in java the JVM maintains string pool to store all string inside the memory th string pool helps in reusing the strings as given below
1. While Creating strings using string literals we are directly providing the value of the string hence the compiler first checks the string pool if the sting already exists then new string is not created instead a new reference points to the already existing string, if the string doesn't exist then a new string is created 
2. While creating strings using new keyword the value of the string is not directly not provided hence a new string is created even though a string is present already inside the memory pool 

Methods Of String There are various method present for java strings following are few of the methods 
   Method Name				  Description
1. substring()				It returns sub string 
2. contains()				It check whether a string contain sub string
3. join()				It joins 2 string by using the delimeter().(space,-)
4. replace()				It Replaces the specified old character with the specified new character
5. replaceAll()				It Replaces all substring matching the regular expression pattern
6. replaceFirst()			It replaces the first matching substring
7. charAt()				It Returns the character present in the specified location
8. indexOf()				It returns the position of the specified character in the string
9. toLowerCase()			It Converts the string to lower case
10. toUpperCase() 			It Converts The string to upper case
11. startsWith() 			It Checks If The String begins with the given string
12. endsWith()				It Checks if the string ends with the given string
13. isEmpty()				It Checks If the sting is empty or not 
14. split()				It Breaks the string into an array of strings
15. trim()				It removes any leading and trailing white spaces
*/

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