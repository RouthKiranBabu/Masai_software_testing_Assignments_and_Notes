class InvalidAgeException extends Exception {
    public InvalidAgeException(String ermsg){
        super(ermsg);
    }
}
public class Main{
    public boolean verifyAge(int age){
        try{
            if(age < 18){
                throw new InvalidAgeException("Age must be 18 or older");
            }
            return true;
        }catch(InvalidAgeException iae){
            System.out.println(iae.getMessage()); // Age must be 18 or older
            return false;
        }
    }
    public static void main(String[] args){
        Main m = new Main();
        boolean isvalidage = m.verifyAge(17);
        System.out.println("Condition for valid age: " + isvalidage);
    }
}
/*Output:
Age must be 18 or older
Condition for valid age: false
*/