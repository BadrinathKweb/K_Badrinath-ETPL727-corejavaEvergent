package Com.evegent.corejava.collections.Queue;
import java.util.LinkedList;
import java.util.Deque;
public class Queue_LinkedList10 {

	public static void main(String[] args) {
		Deque<String> pq = new LinkedList<>();
		pq.add("Banana");
		pq.addFirst("pineapple");
		pq.add("Watermelon");
		pq.addLast("Papaya");
//		pq.offerFirst("Kiwi");
//		pq.add("Apple");
//		System.out.println(pq);
//		System.out.println(pq.size());
//		boolean t = pq.isEmpty();
//		System.out.println(t);
//		pq.clear();
//		System.out.println(pq);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.peekFirst());
		System.out.println(pq.peekLast());
	}
	}
