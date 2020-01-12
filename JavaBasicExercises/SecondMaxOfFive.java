import javax.swing.JOptionPane;

public class SecondMaxOfFive {
	public static void main(String[] args) {

		//	Prompt user for 1st number
		String strUserFirstNum = JOptionPane.showInputDialog("Enter number");
		int firstNum = Integer.parseInt(strUserFirstNum);

		//	Prompt user for 2nd number
		String strUserSecondNum = JOptionPane.showInputDialog("Enter number");
		int secondNum = Integer.parseInt(strUserSecondNum);

		//	Compare 2 numbers and set max number
		int maxNum = Math.max(firstNum, secondNum);

		//	Compare 2 numbers and set min number
		int secondMaxNum = Math.min(firstNum, secondNum);

		//	Prompt the user to enter number in loop
		for (int index = 0; index < 3; index++) {
			String strUserNum = JOptionPane.showInputDialog("Enter number");
			int userNum = Integer.parseInt(strUserNum);

			//	check if user number is less than max number and if true 
			if (userNum > maxNum) {
				secondMaxNum = maxNum;
				maxNum = userNum;
			}
			else if(userNum > secondMaxNum) {
				secondMaxNum = userNum;
			}
		}
		//	Output result
		JOptionPane.showMessageDialog(null, secondMaxNum, "Second Maximum Number", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(secondMaxNum);
	}
}
