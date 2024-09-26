public class EvenOddChecker{
    public void checkEvenOdd(int n){
        // If statement to check reminder is zero when divided by 2
        if (n % 2 == 0){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }
    }
    public static void main(String[] args){
        EvenOddChecker eoche = new EvenOddChecker();
        for(int i = 0; i < 7; i ++){
            eoche.checkEvenOdd(i);
        }
    }
}
/*Output
The number is even.
The number is odd.
The number is even.
The number is odd.
The number is even.
The number is odd.
The number is even.

*/