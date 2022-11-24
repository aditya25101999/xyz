/*

ArrayDeque = Resizable array + Deque interface.
ArrayDeque implements the Queue & Deque interface.
There are no capacity restrictions for ArrayDeque,
 and it provides us the facility to add or remove any element from both sides of the queue.
Also known as Array Double Ended Queue.
It is faster than Linked list and stack
 */

import java.util.*;

public class cwh15_ARRAYDEQUE {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
