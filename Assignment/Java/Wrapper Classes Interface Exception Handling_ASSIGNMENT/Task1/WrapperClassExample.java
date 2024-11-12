public class WrapperClassExample{
    public Integer convertPrimitiveToWrapper(int input){
        Integer newint = input;
        return newint;
    }

    public int convertWrapperToPrimitive(Integer input){
        int output = input;
        return output;
    }

    public static void main(String[] args) {
        WrapperClassExample wce = new WrapperClassExample();
        // Boxing
        Integer ptw = wce.convertPrimitiveToWrapper(12);
        // Unboxing
        int wtp = wce.convertWrapperToPrimitive(ptw);
        System.out.println("Integer value(Wrapper): " + ptw + ", int value: " + wtp);
        // Integer value: 12, int value: 12
    }
}