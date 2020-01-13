import javax.swing.JOptionPane;

public class DigitsOnDifferentPosition {

	public static void main(String[] args) {

		String strFirstNum = JOptionPane.showInputDialog("Enter 1st number");
		int firstNum = Integer.parseInt(strFirstNum);

		String strSecondNum = JOptionPane.showInputDialog("Enter 2nd number");
		int secondNum = Integer.parseInt(strSecondNum);

		int numberLength = strSecondNum.length();
		int[] secondNumArray = new int[numberLength];

		for (int index = 0; index < numberLength; index++) {
			int secondNumRightDigit = secondNum % 10;
			secondNumArray[index] = secondNumRightDigit;
			secondNum = secondNum / 10;
		}

		int matchingDigitsCounter = 0;

		for (int index = 0; index < numberLength; index++) {
			int firstNumRightDigit = firstNum % 10;
			if (firstNumRightDigit != secondNumArray[index]) {
				for (int index2 = 0; index2 < numberLength; index2++) {
					if (firstNumRightDigit == secondNumArray[index2]) {
						matchingDigitsCounter++;
					}
				}
			}
			firstNum = firstNum / 10;
		}
		JOptionPane.showMessageDialog(null, "You entered " + strFirstNum + " as 1st number.\nYou entered " + strSecondNum +
				" as 2nd number.\nThere are " + matchingDigitsCounter + " matching digits on different positions.",
				"Matching digits on different positions", JOptionPane.INFORMATION_MESSAGE);
	}
}
