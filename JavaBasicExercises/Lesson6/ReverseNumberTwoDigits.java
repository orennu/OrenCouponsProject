import javax.swing.JOptionPane;

public class ReverseNumberTwoDigits {

	public static void main(String[] args) {

		//		Get input from user
		String strNum = JOptionPane.showInputDialog("Enter number");

		//		Convert input to integer
		int num = Integer.parseInt(strNum);

		//		Isolate right digit
		int rightDigit = num % 10;

		//		Isolate left digit
		int leftDigit = num / 10;

		//		Building the reversed number
		int reverseNum = rightDigit * 10 + leftDigit;

		//		Output
		JOptionPane.showMessageDialog(null, reverseNum, "Reverse Number", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(reverseNum);

	}

}
