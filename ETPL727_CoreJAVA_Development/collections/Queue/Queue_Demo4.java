package Com.evegent.corejava.collections.Queue;
import java.util.PriorityQueue;
import java.util.Queue;
public class Queue_Demo4 {

	public static void main(String[] args) {
		Queue pq= new PriorityQueue();
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);
		System.out.println(pq.isEmpty());
		pq.clear();
		System.out.println(pq.isEmpty());

	}

}
