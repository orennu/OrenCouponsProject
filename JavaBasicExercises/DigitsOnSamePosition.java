import javax.swing.JOptionPane;

public class DigitsOnSamePosition {

	public static void main(String[] args) {
		
		String strFirstNum = JOptionPane.showInputDialog("Enter 1st number");
		int firstNum = Integer.parseInt(strFirstNum);
		
		String strSecondNum = JOptionPane.showInputDialog("Enter 2nd number");
		int secondNum = Integer.parseInt(strSecondNum);
		
		int matchingDigitsCounter = 0;
		
		for (int index = 0; index < strFirstNum.length(); index++) {
			int firstNumRightDigit = firstNum % 10;
			int secondNumRightDigit = secondNum % 10;
			
			if (firstNumRightDigit == secondNumRightDigit) {
				matchingDigitsCounter++;
			}
			
			firstNum = firstNum / 10;
			secondNum = secondNum / 10;
		}
		System.out.println(matchingDigitsCounter);
	}
}
