public class ExceptionHandlingExample {
    public double divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero.");
        }
        double res = a/b;
        return res;
    }
    public static void main(String[] args) {
        try{
            ExceptionHandlingExample e = new ExceptionHandlingExample();
            double res = e.divide(10, 0);
            System.out.println(res);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
// Output:
// Cannot divide by zero.