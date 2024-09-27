class ExceptionHandlingExample{
    public double divide(int a, int b){
        try{
            if(b == 0){
                throwError();
            }
            return a/b;
        }catch(ArithmeticException e){
            System.out.println("Caught Exception: " + e.getMessage());
            return 0.0;
        }
    }
    public static void throwError() throws ArithmeticException{
        throw new ArithmeticException("Cannot divide by zero.");
    }
}

public class Main {
    public static void main(String[] args){
        ExceptionHandlingExample e = new ExceptionHandlingExample();
        e.divide(1, 0);
    }
}
