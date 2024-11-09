package CollectionFramework;

import java.util.ArrayDeque;

public class arrayDeque {
    public static void main (String args[]) {
        // double ended queue -> can add/remove element from front and back
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(20);  // normal add in queue
        adq.offerFirst(10); // add at front
        adq.offerLast(30);  // add from last

        System.out.println(adq);

        // same peek with first and last
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        // same poll with first and last
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
    }
}
