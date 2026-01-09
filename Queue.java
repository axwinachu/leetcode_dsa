import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        pq.offer(10);
        pq.offer(20);
        pq.offer(1);
        pq.offer(30);
        System.out.println(pq.peek());
    }
    
}
