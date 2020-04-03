
public class Tester {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.display();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.display();
		stack.size();
		stack.pop();
		stack.display();
		stack.size();
	}
}
