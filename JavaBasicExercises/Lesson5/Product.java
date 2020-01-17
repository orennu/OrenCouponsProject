import javax.swing.JOptionPane;

public class Product {
	public static void main(String[] args) {
		
		String strFirstNum = JOptionPane.showInputDialog("Enter first number");
		int firstNum = Integer.parseInt(strFirstNum);
		String strSecondNum = JOptionPane.showInputDialog("Enter second number");
		int secondNum = Integer.parseInt(strSecondNum);
		
		int multiplier = 0;
		int product = 0;
		
		if (secondNum > 0) {
			multiplier = secondNum;
		}
		else {
			multiplier = secondNum - (secondNum + secondNum);
		}
		
		for (int index = multiplier; index > 0; index--) {
			product = product + firstNum;
		}
		
		if (firstNum == 0 || secondNum == 0) {
			System.out.println(product);
		}
		else if (secondNum > 0) {
			System.out.println(product);
		}
		else {
			product = product - (product + product);
			System.out.println(product);
		}
	}
}
