import javax.swing.JOptionPane;

public class MaxSubSetSum {
	public static void main(String[] args) {
		String strCount = JOptionPane.showInputDialog("How many numbers ?");
		int count = Integer.parseInt(strCount);
		
		String strUserNum = JOptionPane.showInputDialog("Enter number");
		int firstNum = Integer.parseInt(strUserNum);
		
		int currentSum = firstNum;
		int maxSum = firstNum;
		
		for (int index = 0; index < count - 1; index++) {
			strUserNum = JOptionPane.showInputDialog("Enter number");
			int userNum = Integer.parseInt(strUserNum);
			
			// Edge case to handle first number is negative and second number is positive
			if (userNum > 0 && firstNum < 0) {
				currentSum = userNum;
				maxSum = userNum;
				firstNum = 1;
			}
			else if (currentSum + userNum > maxSum) {
				currentSum = currentSum + userNum;
				maxSum = currentSum;
			}
			else if (currentSum + userNum > 0) {
				currentSum = currentSum + userNum;
			}
			else if (userNum > currentSum) {
				currentSum = userNum;
				maxSum = userNum;
			}
			else {
				currentSum = 0;
			}
		}
		
		JOptionPane.showMessageDialog(null, maxSum, "Maximum Sum", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(maxSum);
	}
}
