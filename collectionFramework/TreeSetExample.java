package collectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("abanana");
        treeSet.add("cherry");

        System.out.println(treeSet);
    }
}
