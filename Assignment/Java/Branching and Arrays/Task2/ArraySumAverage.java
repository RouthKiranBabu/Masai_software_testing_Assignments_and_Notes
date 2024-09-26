public class ArraySumAverage {
    public void calculateSumAndAverage(int[] arr){
        double sum = 0;
        // Moving to all the element present in array
        for (int i = 0; i < arr.length; i ++){
            // Number gets added to sum
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.printf("%.2f", sum/arr.length);
    }
    public static void main(String[] args){
        int[] numarr = {1, 2, 3, 2, 3};
        ArraySumAverage asa = new ArraySumAverage();
        asa.calculateSumAndAverage(numarr);
    }
}
// 11.0
// 2.20