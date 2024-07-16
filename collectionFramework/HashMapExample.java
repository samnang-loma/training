package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "apple");
        hashMap.put(2, "banana");
        hashMap.put(3, "cherry");

        System.out.println(hashMap);
    }
}
