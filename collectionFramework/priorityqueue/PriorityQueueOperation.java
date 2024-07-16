package collectionFramework.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueOperation {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        addElement(queue, "zoo");
        addElement(queue, "bayon");
        addElement(queue, "hehe");
        addElement(queue, "meow");

        System.out.println(queue);
    }

    public static void addElement(PriorityQueue<String> queue, String element){
        queue.add(element);
    }


}
