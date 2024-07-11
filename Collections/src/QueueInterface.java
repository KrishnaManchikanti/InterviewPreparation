import java.util.*;

public class QueueInterface {
    //FIFO Principal //messages, email, job scheduling, etc.
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//PriorityQueue
        //FIFO principal, implements using Arrays, default value is 11
        //insertion at Tail, deletion from Head
        //offer/add, peek, poll/remove, contains, isEmpty, clear
        pq.offer(29);
        pq.offer(59);
        pq.offer(55);
        pq.offer(63);
        pq.offer(23);
        //head value is always the priority ****
        System.out.println(pq.peek() + " " + pq);//give null if empty, bcoz internally it is implemented by arrayObject.
        System.out.println(pq.poll() + " " + pq);
        System.out.println(pq.contains(55));
        for (Integer i : pq)
            System.out.print(i + " ");//doesn't give o/p by priority, use peek/poll for priority values
        System.out.println();
        System.out.println(pq.isEmpty());
        pq.clear();//to clear the pq

//Deque/LL -> doubleEndedQueue
        ArrayDeque<String> ad = new ArrayDeque<>();
        //implements using Arrays, default value is 17,
        //insertion&deletion from Tail&Head
        //offer, offerFirst, offerLast, peekFirst, peekLast, pollFirst, pollLast, size, isEmpty
        ad.offer("Banana");
        ad.offerFirst("grape");
        ad.offerLast("apple");
        ad.offer("kiwi");
        ad.offerFirst("orange");
        ad.offerLast("pineapple");
        System.out.println(ad);
        System.out.println(ad.peekFirst() + " " + ad.peekLast());
        System.out.println(ad.poll() + " " + ad.pollFirst() + " " + ad.pollLast());
        System.out.println(ad + " " + ad.size() + " " + ad.isEmpty());


    }
}
