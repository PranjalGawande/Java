package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class linkedListQueue {
    public static void main(String args[]) {
        // FIFO
        // queue using ll
        Queue<Integer> queue = new LinkedList<>();

        // add element in queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        // remove front and return the removed element
        System.out.println(queue.poll());

        System.out.println(queue);

        // return front element
        System.out.println(queue.peek());
    }
}
