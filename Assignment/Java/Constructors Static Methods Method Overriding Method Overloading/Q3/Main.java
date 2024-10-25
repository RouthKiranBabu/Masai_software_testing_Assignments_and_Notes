class MathOperations{
    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return Math.abs(a - b);
    }
    public static int multiply(int a, int b){
        return a * b;
    }
}

public class Main {
    public static void main(String[] args){
        MathOperations m = new MathOperations();
        System.out.println(m.add(1,2)); // 3
        System.out.println(m.subtract(1,2)); // 1
        System.out.println(m.multiply(1,2)); // 2
    }
}
