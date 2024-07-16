package collectionFramework.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashsetOperation {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        addElement(hashSet, "apple");
        addElement(hashSet, "banana");
        addElement(hashSet, "cat");
        addElement(hashSet, "coco");

        System.out.println(hashSet);
        System.out.println("Is hashset empty? " + hashSet.isEmpty());
        System.out.println("Remove all");
        removeAllElement(hashSet);
        System.out.println("Is hashset empty? " + hashSet.isEmpty());
        System.out.println(hashSet);
    }

    public static void addElement(Set<String> hashSet, String element){
        hashSet.add(element);
    }

    public static void removeAllElement(Set<String> hashset){
        hashset.removeAll(hashset);
    }

}
