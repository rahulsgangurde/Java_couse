import java.util.PriorityQueue;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue <>();
		
		queue.add("Banana");
		queue.add("ticket");
		queue.add("Apple");
		
		System.out.println("Queue: " +queue);
		
		queue.remove();
		
		System.out.println("Queue: " +queue);
		
		String head = queue.peek();
		
		System.out.println("head Queue: " +head);
		
		head=queue.poll();
		
		System.out.println(" head Queue: " +queue);
		
	}

}
