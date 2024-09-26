public class MaxValueFinder {
    public void findMaxValue(int[] arr){
        // Initially Choosing a first indexed number
        int v = arr[0];
        for (int i = 1; i < arr.length; i ++){
            // If variable data is less then any element in arr it store that integer
            if (v < arr[i]){
                v = arr[i];
            }
        }
        System.out.print(v);
    }
    public static void main(String[] args){
        int[] intarr = {12, 3, 44, 43, 11};
        MaxValueFinder mvf = new MaxValueFinder();
        mvf.findMaxValue(intarr);
    }
}
// 44