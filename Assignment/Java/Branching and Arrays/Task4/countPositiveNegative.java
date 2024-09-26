public class countPositiveNegative {
    public void countPositiveNegative(int[] arr){
        // variables to count positive and negative
        int cp = 0;
        int cn = 0;
        // Loop to start incrementing the variable
        for (int i = 0; i < arr.length; i ++){
            // If statement to check positive number
            if (arr[i] >= 0){
                cp += 1;
            // else statement to check negative number
            }else{
                cn += 1;
            }
        }
        System.out.println("Positive Number: " + cp);
        System.out.print("Negative Number: " + cn);
    }
    public static void main(String[] args){
        int[] intarr = {-2, 0, 2, 1, -3, 1};
        countPositiveNegative cpn = new countPositiveNegative();
        cpn.countPositiveNegative(intarr);
    }
}
// Positive Number: 4
// Negative Number: 2