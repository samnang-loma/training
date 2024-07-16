package collectionFramework.arrayList;

import java.util.ArrayList;
import java.util.List;

public class InsertElementToFirstIndexAndLastIndex {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("green");
        ls.add("blue");
        ls.add("yellow");
        System.out.println(ls);
        ls.add(0, "black");
        System.out.println(ls);
    }
}
