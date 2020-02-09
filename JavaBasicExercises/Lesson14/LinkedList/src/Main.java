
public class Main {

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(7);
		Node node3 = new Node(12);
		Node node4 = new Node(17);
		Node node5 = new Node(2);

		// link the 1st node to 2nd node (node1 to node2) 
		node1.setNext(node2);

		// link the 2nd node to 3rd node (node2 to node3)
		node2.setNext(node3);
		
		node3.setNext(node4);
		node4.setNext(node5);
		
		// Print values of linked list nodes in order (from head to tail)
		printHeaders("Executing print");
		print(node1);
		
		// Print values of linked list nodes in reverse order (from tail to head)
		printHeaders("Executing printRevered");
		printReversed(node1);
		
		// Print sum of nodes' values in linked list
		printHeaders("Executing sumValuesInLinkedList");
		System.out.println(sumValuesInLinkedList(node1));
		
		// Print length of linked list (how many nodes)
		printHeaders("Executing lengthOfLinkedList");
		System.out.println(lengthOfLinkedList(node1));
		
		// Print min value of nodes' values in linked list
		printHeaders("Executing minValue");
		System.out.println(minValue(node1));
		
		// Print remove last item from linked list
		printHeaders("Executing removeLastNode");
		System.out.println("Linked list before:\n-------------------");
		print(node1);
		removeLastNode(node3);
		System.out.println("\nLinked list after:\n------------------");
		print(node1);
		
		// Print value of previous node
		printHeaders("Get value of previous node");
		node2.setPrevious(node1);
		System.out.println("Value of node1: " + node1.getValue());
		System.out.println("Value of node2's previous node (also node1): " + node2.getPrevious().getValue());
		
		// Print if linked list is cyclic
		node4.setNext(node1); // setting this because node 5 was removed on removeLastNode
		printHeaders("Executing isCyclic");
		System.out.println(isCyclic(node1));
		
		// Print if linked list has loop
		node4.setNext(node2);
		printHeaders("Executing hasLoop");
		System.out.println(hasLoop(node1));
	}

	private static void removeLastNode(Node node) {
		
		if (node.getNext().getNext() == null) {
			node.setNext(null);
			return;
		}
		
		removeLastNode(node.getNext());
	}

	private static boolean hasLoop(Node node) {
		
		Node slow = node;
		Node fast = node;
		
		while(slow != null && fast != null && fast.getNext() != null) {
			if (slow == fast) {
				return true;
			}
			
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if (slow == fast) {
				return true;
			}
		}
		
		return false;
	}

	private static boolean isCyclic(Node node) {
		
		if (node == null) {
			return false;
		}
		
		Node head = node;
		
		return isCyclic(node.getNext(), head);
	}

	private static boolean isCyclic(Node node , Node head) {
		
		if (node == null) {
			return false;
		}
		
		if (node.getNext() == head) {
			return true;
		}
		
		return isCyclic(node.getNext(), head);
	}
	
	private static int minValue(Node node) {
		
		if (node == null) {
			return 0;
		}
		
		int min = node.getValue();
		
		return minValue(node, min);
		
	}
	
	private static int minValue(Node node, int min) {
		
		if (node == null) {
			return min;
		}
		
		if (node.getValue() < min) {
			min = node.getValue();
		}
		
		return minValue(node.getNext(), min);
	}

	private static int lengthOfLinkedList(Node node) {
		
		if (node == null) {
			return 0; 
		}
		
		return 1 + lengthOfLinkedList(node.getNext());
	}

	private static int sumValuesInLinkedList(Node node) {
		
		if (node == null) {
			return 0; 
		}
		
		return sumValuesInLinkedList(node.getNext()) + node.getValue();
		
	}

	private static void printReversed(Node node) {
		if (node == null) {
			return;
		}

		printReversed(node.getNext());
		
		System.out.println(node.getValue());
	}

	private static void print(Node node) {

		// if I reached end of linked list there is nothing to print
		if (node == null) {
			return;
		}

		// if we reached here it means there is a cell with value we can print so we print it
		System.out.println(node.getValue());
		
		// recurse to print next node in linked list
		print(node.getNext());
	}
	
	private static void printHeaders(String name) {
		
		System.out.println("\nExecuting " + name + "\n=========================================");
	}
}
