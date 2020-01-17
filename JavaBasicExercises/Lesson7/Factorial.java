import javax.swing.JOptionPane;

public class Factorial {
	public static void main(String[] args) {

		String strUserNum = JOptionPane.showInputDialog("Enter number");
		int userNum = Integer.parseInt(strUserNum);

		if (userNum >= 0) {
			int factorial = userNum;

			if (userNum > 1) {
				for (int index = userNum; index > 2; index--) {
					factorial = factorial * (index -1);
				}
			}
			else {
				factorial = 1;
			}
			System.out.println(factorial);
		}
		else {
			System.out.println("undefined");
		}
	}
}
