import java.util.List;
import java.util.ArrayList;

import java.util.Set;
import java.util.HashSet;

import java.util.Queue;
import java.util.LinkedList;

import java.util.Map;
import java.util.HashMap;

import java.util.SortedSet;
import java.util.TreeSet;

import java.util.SortedMap;
import java.util.TreeMap;

public class JavaProj{
    public static void main(String[] args){
        // For list
        List<String> myList = new ArrayList<>();
        myList.add("StudentName_A");
        myList.add("StudentName_B");
        System.out.println(myList.get(0)); // Outputs👉StudentName_A

        // For Set
        Set<String> mySet = new HashSet<>();
        mySet.add("StudentName_A");
        mySet.add("StudentName_B");
        mySet.add("StudentName_A"); // Duplicate "StudentName_A" will be ignored
        System.out.println(mySet); // [StudentName_B, StudentName_A]

        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("StudentName_A");
        queue.add("StudentName_b");
        System.out.println(queue.poll()); // Outputs "StudentName_A"

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("StudentName_A", 1);
        map.put("StudentName_B", 2);
        System.out.println(map.get("StudentName_A")); // Outputs👉 1

        // Sorted set
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("StudentName_A");
        sortedSet.add("StudentName_B");
        sortedSet.add("StudentName_A");
        System.out.println(sortedSet); // Outputs [StudentName_A, StudentName_B]

        // Sorted Map
        SortedMap<String, String> sortedMap = new TreeMap<>();
        sortedMap.put("StudentName_B", "B");
        sortedMap.put("StudentName_A", "A");
        System.out.println(sortedMap); // Outputs {StudentName_A=A, StudentName_B=B}
    }
}