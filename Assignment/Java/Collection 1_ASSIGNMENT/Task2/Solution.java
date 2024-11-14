import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        for(String word: words){
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Dictionary: " + wordCount);
        for(Map.Entry<String, Integer> item : wordCount.entrySet()){
            System.out.print("\nKey: " + item.getKey() + ".\nvalue: " + item.getValue() + ".\n");
        }
    }
}
