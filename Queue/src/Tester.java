
public class Tester {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.dequeue();
		queue.enqueue(20);
		queue.dequeue();
		queue.enqueue(65);
		queue.enqueue(78);
		queue.dequeue();
		queue.enqueue(199);
		queue.enqueue(17);
		queue.dequeue();
		queue.dequeue();
		queue.size();
	}
}
