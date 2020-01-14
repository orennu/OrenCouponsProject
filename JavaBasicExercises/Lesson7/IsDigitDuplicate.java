import javax.swing.JOptionPane;

public class IsDigitDuplicate {
	public static void main(String[] args) {
		
		String strUserNum = JOptionPane.showInputDialog("Enter number");
		int userNum = Integer.parseInt(strUserNum);
		
		boolean[] digitsArray = new boolean[10];
		boolean duplicate = false;
		
		while (userNum > 0 && !duplicate) {
			int rightDigit = userNum % 10;
			userNum = userNum /10;
			if (digitsArray[rightDigit]) {
				duplicate = true;
			}
			else {
				digitsArray[rightDigit] = true;
			}
		}
		
		if (duplicate) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
