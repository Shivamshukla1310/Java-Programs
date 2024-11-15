/*Java Throw & Throws:-

--> In Java Exception can be categorized into 2 types
1. Unchecked Exception - They are not checked at compile time but at runtime
For Ex:- ArithmaticException, NullPointerException, ArrayIndexOutOfBoundsException, ExceptionUnderErrorClass etc.
2. Checked Exception - They are checked at complie time 
For Ex:- IOException,InterupptedException etc.

We Don't Need To Handle Unchecked Exceptions Because Unchecked Exceptions Occur Due To programming errors, It is a good practice to correct them instead of handling them
Java Throw Keyword:-

The Throw Keyword Is Used To Explicitly throw a single exception when an exception is thrown the flow of the program transfers from the try block to the catch block, We Use Throw Keyword Inside/within a method

Syntax:-

throw new throwableObject;
// A throwable object is an instance of class Throwable or Sub Class Of the Throwable Class

Java Throws Keyword:-

-->  We Use Throws Keyword In The Method Declaration To Declare The type of exception that might occur within it.

Syntax:-

AccessModifier returntype methodname()throws Exception1, Exception2...., ExceptionN{
	--------------
	--------------
	--------------
}*/

import java.io.*;
class ThrowsEx {
     public static void main(String[] args) {
        try {
            methodWithException();
        } catch (IOException e) {
            System.out.println("Caught IOException: " 
            + e.getMessage());
        }
    }
    public static void methodWithException() throws IOException {
        // Simulate an IOException
        throw new IOException("This is an IOException");
    }
}