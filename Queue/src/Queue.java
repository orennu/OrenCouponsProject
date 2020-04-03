/*
 * Queue implementation using LinkedList
 */

public class Queue {
	
	private Node first;
	private Node last;
	private int queueSize;
	
	private class Node {
		int data;
		Node next;
	}
	
	public Queue() {
		this.first = null;
		this.last = null;
		this.queueSize = 0;
	}
	
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return queueSize;
		}
		int data = first.data;
		first = first.next;
		
		if (isEmpty()) {
			last = null;
		}
		
		queueSize--;
		System.out.println(data + " removed from queue");
		return data;
	}
	
	public void enqueue(int data) {
		Node temp = last;
		last = new Node();
		last.data = data;
		last.next = null;
		
		if (isEmpty()) {
			first = last;
		}
		else {
			temp.next = last;
		}
		
		queueSize++;
		System.out.println(data + " added to queue");
	}

	private boolean isEmpty() {
		return (queueSize == 0);
	}
	
	public void size() {
		System.out.println("queue size is " + queueSize);
	}
}
