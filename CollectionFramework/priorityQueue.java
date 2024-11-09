package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main (String args[]) {
        // default min heap -> smallest element at top and have highest priority
        Queue<Integer> pq = new PriorityQueue<>();

        // max heap
        Queue<Integer> pqMax = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(85);
        pq.offer(43);
        pq.offer(64);
        pq.offer(10);
        pq.offer(23);

        System.out.println(pq);
        
        pq.poll();
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
