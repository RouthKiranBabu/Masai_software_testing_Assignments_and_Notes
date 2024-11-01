class ExceptionHandlingExample{
    public double divide(double a, double b){
        try {
            if (b == 0.0){throw new ArithmeticException("Cannot divide by zero.");}
            return a/b;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ExceptionHandlingExample eh = new ExceptionHandlingExample();
        System.out.println(eh.divide(1, 2)); // 0.5
        System.out.println(eh.divide(1, 0)); // Exception in thread "main" java.lang.ArithmeticException: Cannot divide by zero.
    }
}
