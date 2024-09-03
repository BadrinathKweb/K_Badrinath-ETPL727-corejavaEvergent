package Com.evegent.corejava.collections.Queue;
import java.util.ArrayDeque;
public class Queue_ArrayDeque9 {

	public static void main(String[] args) {
		ArrayDeque<String> pq = new ArrayDeque<>();
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
		System.out.println(pq.poll());
		System.out.println(pq.pollFirst());
		System.out.println(pq.pollLast());
	}
	}
