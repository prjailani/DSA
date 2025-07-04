import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue; 
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(); // Min Heap
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); For Max Heap
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); For Max Heap another way
        pq.add(10);
        pq.add(1);
        pq.add(5);
        pq.add(7);
        pq.add(1);
        // System.out.println(pq);

        Queue<String> q = new PriorityQueue<>();
        q.add("Jihin");
        q.add("abc");
        q.add("a");
        q.add("ab");
        q.add("abcd");
        System.out.println(q); // Lexicographical like dictionary. Here Jihin comes first because capital ASCII comes first

        System.out.println(q.poll()); // Remove element and return.
        System.out.println(q);

        /*
         * Min Heap - Smallest at first
         * Max Heap - Largest at first
         * 
         * For Strings
         * - First check Lexicographically like dictionary
         * - Then check length
         * - Remember it for both Min Heap and Max Heap (Collections.reverseOrder());
         */

         /* It is always recommended to use poll() and isEmpty() instead of for each in Queues */
    }
}