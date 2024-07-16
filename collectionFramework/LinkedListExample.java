package collectionFramework;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        // Inserting element at a specific position
        linkedList.add(2, "X");

        // Removing an element
        linkedList.remove("B");

        // Iterating over the elements
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Demonstrating efficient insertion during iteration
        iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("C")) {
                iterator.add("Y");
            }
        }

        System.out.println("After modifications:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
