public class Solution{
    public double divide(int a, int b){
        double d = 0;
        if (b != 0){
            d = a / b;
        }else{
            ArithmeticException ae = new ArithmeticException("Cannot divide by zero");
            throw ae;
        }
        return d;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        try{
            double ds = s.divide(12, 0);
            System.out.println("12 / 0 = " + ds);
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage()); // Cannot divide by zero
        }
        
    }
}