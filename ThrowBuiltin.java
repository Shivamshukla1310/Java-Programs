// Throw Keyword Usage:-

public class ThrowBuiltin {
    public static void divideByZero() {
        // throw an exception
        throw new ArithmeticException("Denominator should not be zero");
      }
    
      public static void main(String[] args) {
        divideByZero();
      }
}