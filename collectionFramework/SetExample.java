package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("nana");
        hashSet.add("cherry");

        System.out.println(hashSet);
    }
}
