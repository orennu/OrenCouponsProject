import javax.swing.JOptionPane;

public class NumberOfDigits {
	public static void main(String[] args) {

		String strUserNum = JOptionPane.showInputDialog("Enter number");
		int num = Math.abs(Integer.parseInt(strUserNum));
		
		int numOfDigits = 1;
		
		while (num > 9) {
			num = num / 10;
			numOfDigits++;
		}
		
		JOptionPane.showMessageDialog(null, numOfDigits, "Number of Digits", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(numOfDigits);
	}
}
