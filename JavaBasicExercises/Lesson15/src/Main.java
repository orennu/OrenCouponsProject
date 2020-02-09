import javax.swing.JOptionPane;

public class Main {
	/*
	 * More recursions and linked lists
	 */
	
	public static void main(String[] args) {

		String userNumStr = JOptionPane.showInputDialog("Enter number");
		int userNum = Integer.parseInt(userNumStr);
		String userDigitStr = JOptionPane.showInputDialog("Enter digit");
		int digit = Integer.parseInt(userDigitStr);

		// Print number length
		System.out.println("Length of " + userNum + ": " + calcNumberLength(userNum));

		// Print digits sum
		System.out.println("Digits sum of " + userNum + ": " + calcNumberDigitsSum(userNum));

		// Print if digit in num
		System.out.println(digit + " is in " + userNum + ": " + isDigitInNumber(userNum, digit));

		Node node3 = new Node(2);
		Node node2 = new Node(3, node3);
		Node node1 = new Node(1, node2);

		// Print if value in linked list
		System.out.println(userNum + " is in linked list: " + isValueInLinkedList(node1, userNum));

		// Print if value is last in linked list
		System.out.println(userNum + " is last in linked list: " + isValueLastInLinkedList(node1, userNum));
	}

	private static boolean isValueLastInLinkedList(Node node, int num) {

		if (node == null) {
			return false;
		}

		if (node.getNext() == null && node.getValue() == num) {
			return true;
		}

		return isValueLastInLinkedList(node.getNext(), num);
	}

	private static boolean isValueInLinkedList(Node node, int num) {

		if (node == null) {
			return false;
		}

		if (node.getValue() == num) {
			return true;
		}

		return isValueInLinkedList(node.getNext(), num);
	}

	private static int calcNumberLength(int num) {

		if (num < 10) {
			return 1;
		}

		return 1 + calcNumberLength(num / 10);
	}

	private static int calcNumberDigitsSum(int num) {

		if (num < 10) {
			return num;
		}

		return (num % 10) + calcNumberDigitsSum(num / 10);
	}

	private static boolean isDigitInNumber(int num, int digit) {

		if (num < 10) {
			if (num == digit) {
				return true;
			}
			return false;
		}

		if (digit == num % 10) {
			return true;
		}

		return isDigitInNumber(num / 10, digit);
	}

}