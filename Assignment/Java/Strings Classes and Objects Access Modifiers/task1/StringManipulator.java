//hashmap for dictionary
import java.util.HashMap;
public class StringManipulator{
    // for count the vowels in form of dictionary
    public HashMap countVowels(String input){
        //String input = "Java programming is fun";
        // converting into lower case
        input = input.toLowerCase();
        // creating the hashmap
        HashMap<Character, Integer> vowelCountMap = new HashMap<>();
        String vowels = "aeiou";
        // initialized to zero
        for (char vowel : vowels.toCharArray()) {
            vowelCountMap.put(vowel, 0);
        }
        // incrementing by one for corrsponding key vowel is present
        for (char c : input.toCharArray()) {
            if (vowelCountMap.containsKey(c)) {
                vowelCountMap.put(c, vowelCountMap.get(c) + 1);
            }
        }
        return vowelCountMap;
    }
    public String reverseString(String str){
        String newstr = "";
        // For loop moving from the last index to first
        for (int i = str.length() - 1; i >= 0; i --){
            newstr += str.charAt(i);
        }
        return newstr;
    }
    public static void main(String[] args){
        StringManipulator sm = new StringManipulator();
        String input = "Java programming is fun";
        System.out.println(sm.countVowels(input)); // {a=3, e=0, u=1, i=2, o=1}
        System.out.print(sm.reverseString(input)); // nuf si gnimmargorp avaJ
    }
}