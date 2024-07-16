package collectionFramework;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(9, "elephant");
        treeMap.put(5, "dog");
        treeMap.put(6, "frog");

        System.out.println(treeMap);
    }
}
