/*Use Of Multiple Catch Block

--> For Each try block there can be zero or more catch block, multiple catch blocks allow us to handle each exception differently, The argument type of each catch block indicates the type of exception that can be handled by it.*/

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
          } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
          } 
    }
}

