class StringManipulator{
    public String concatenate(String str1, String str2){
        return str1.concat(str2);
    }
    public int getLength(String str){
        return str.length();
    }
    public String convertToUpper(String str){
        return str.toUpperCase();
    }
}

public class Main {
    public static void main(String[] args){
        StringManipulator sm = new StringManipulator();
        System.out.println(sm.concatenate("str1", "str2")); // str1str2
        System.out.println(sm.convertToUpper("Hello, World!")); // HELLO, WORLD!
        System.out.println(sm.getLength("Jai Hanuman!")); // 12
    }
}
