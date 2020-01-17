import javax.swing.JOptionPane;

public class IsPalindrome {
	public static void main(String[] args) {

		int divisor = 1;
		boolean isPalindrome = true;

		String strUserNum = JOptionPane.showInputDialog("Enter number");
		int userNum = Integer.parseInt(strUserNum);

		while ((userNum / divisor) >= 10) {
			divisor = divisor * 10;
		}
		while (userNum != 0) {
			int leftDigit = userNum / divisor;
			int rightDigit = userNum % 10;

			if (leftDigit != rightDigit) {
				isPalindrome = false;
				break;
			}
			else {
				userNum = (userNum % divisor) / 10;
				divisor = divisor / 100;
			}
		}
		if (isPalindrome) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
