public class Main {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4};
        try{
            int binx = nums[10];
            System.out.println(binx);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Message: " + e.getMessage());
        }
        System.out.print("After Exception handling!");
    }
}
// Message: Index 10 out of bounds for length 4
// After Exception handling!