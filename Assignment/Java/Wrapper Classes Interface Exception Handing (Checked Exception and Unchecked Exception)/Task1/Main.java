class WrapperClassExample{
    public Integer convertPrimitiveToWrapper(int input){
        Integer newint = Integer.valueOf(input);
        return newint;
    }
    public int convertWrapperToPrimitive(Integer input){
        int newint = input.intValue();
        return newint;
    }
}
public class Main{
    public static void main(String[] args){
        WrapperClassExample wc = new WrapperClassExample();
        Integer iger = wc.convertPrimitiveToWrapper(12);
        int ints = wc.convertWrapperToPrimitive(iger);
        System.out.println(iger); // 12
        System.out.println(ints); // 12
    }
}