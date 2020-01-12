import javax.swing.JOptionPane;

public class ReverseNumber {
	public static void main(String[] args) {
		
		String strUserNum = JOptionPane.showInputDialog("Enter number");
		int userNum = Integer.parseInt(strUserNum);
		int num = Math.abs(userNum);
		
		int numOfDigits = 1;
		
		while (num > 9) {
			num = num / 10;
			numOfDigits++;
		}
		
		int reverseNum = 0;
		int multiplier = (int) Math.pow(10, (numOfDigits - 1));
		
		for (int index = 0; index < numOfDigits; index++) {
			int rightDigit = userNum % 10;
			int reverseTempNum = rightDigit * multiplier;
			userNum = userNum / 10;
			reverseNum = reverseNum + reverseTempNum;
			multiplier = multiplier / 10;
		}
		
		JOptionPane.showMessageDialog(null, reverseNum, "Reverse Number", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(reverseNum);
	}
}
