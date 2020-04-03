/*
 * Stack implementation using LinkedList
 */

public class Stack {
	
	private Node top;
	private int stackSize;
	
	private class Node {
		int data;
		Node next;
	}
	
	Stack() {
		this.top = null;
		this.stackSize = 0;
	}
	
	public void push(int data) {
		Node temp = new Node();
		
		temp.data = data;
		temp.next = top;
		top = temp;
		stackSize++;
		System.out.println(data + " pushed to stack");
		
	}
	
	public void pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		
		System.out.println(top.data+ " poped from stack");
		top = top.next;
		stackSize--;
	}
	
	public void top() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		
		System.out.println(top.data + " is stack top");
	}
	
	public void display() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	private boolean isEmpty() {
		return (stackSize == 0);
	}
	
	public void size() {
		System.out.println("stack size is " + stackSize);
	}
}
