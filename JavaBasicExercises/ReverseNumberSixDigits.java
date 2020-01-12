import javax.swing.JOptionPane;

public class ReverseNumberSixDigits {
	public static void main(String[] args) {
		
		String strUserNum = JOptionPane.showInputDialog("Enter 6 digit number");
		int userNum = Integer.parseInt(strUserNum);
		int userNumLength = 6;
		int reverseNum = 0;
		int multiplier = 100000;
		
		for (int index = 0; index < userNumLength; index++) {
			int rightDigit = userNum % 10;
			int reverseTempNum = rightDigit * multiplier;
			userNum = userNum / 10;
			reverseNum = reverseNum + reverseTempNum;
			multiplier = multiplier / 10;
		}
		System.out.println(reverseNum);

	}
}
