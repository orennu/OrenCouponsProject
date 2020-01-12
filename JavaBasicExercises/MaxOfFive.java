import javax.swing.JOptionPane;

public class MaxOfFive {
	public static void main(String[] args) {

		//		Prompt user for 1st number and make it max
		String strUserNum = JOptionPane.showInputDialog("Enter number");
		int maxNum = Integer.parseInt(strUserNum);

		//		Prompt the user to enter number in loop
		for (int index = 0; index < 4; index++) {
			strUserNum = JOptionPane.showInputDialog("Enter number");
			int userNum = Integer.parseInt(strUserNum);

			//			compare max number to latest input from user
			if (userNum > maxNum) {
				maxNum = userNum;
			}
		}
		//		Output result
		JOptionPane.showMessageDialog(null, maxNum, "Maximum Number", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(maxNum);
	}
}
