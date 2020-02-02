import javax.swing.JOptionPane;

public class SimpleRecursions {
	public static void main(String[] args) {
		
		String strFirstNum = JOptionPane.showInputDialog("Enter first number");
		int firstNum = Integer.parseInt(strFirstNum);
		String strSecondNum = JOptionPane.showInputDialog("Enter second number");
		int secondNum = Integer.parseInt(strSecondNum);
		
		int product = multiplyTwoNumbers(firstNum, secondNum); 
		System.out.println("product of " + firstNum + " x " + secondNum + " = " + product);
		
		int division = divideTwoNumbers(firstNum, secondNum);
		System.out.println("division of " + firstNum + " / " + secondNum + " = " + division);
		
		int modulo = moduloOfTwoNumbers(firstNum, secondNum);
		System.out.println("modulo of " + firstNum + " / " + secondNum + " = " + modulo);
	}
	
	public static int multiplyTwoNumbers(int num1, int num2) {
		
		if (num1 == 0) {
			return 0;
		}
		
		return num2 + multiplyTwoNumbers(num1 - 1, num2);
	}
	
	public static int divideTwoNumbers(int num1, int num2) {
		
		if (num1 < num2) {
			return 0;
		}
		
		return 1 + divideTwoNumbers(num1 - num2, num2);
	}
	
	public static int moduloOfTwoNumbers(int num1, int num2) {

		if (num1 < num2) {
			return num1;
		}

		return moduloOfTwoNumbers(num1 - num2, num2);
	}
}
