package Task1;
class WrapperClassExample{
    public Integer convertPrimitiveToWrapper(int input){
        // int is a primitive type
        int inp = input;
        // Integer is a wrapper class
        Integer inte = inp;
        return inte;
    }
    public int convertWrapperToPrimitive(Integer val){
        Integer ints = Integer.valueOf(val);
        int intoint = ints.intValue();
        return intoint;
    }
}

public class Main extends WrapperClassExample{
    public static void main(String[] args){
        Integer wra = 10;
        WrapperClassExample w = new WrapperClassExample();
        int pri = w.convertWrapperToPrimitive(wra);
        System.out.println(pri);
        Integer newwra = w.convertPrimitiveToWrapper(pri);
        System.out.println(newwra);
    }
}