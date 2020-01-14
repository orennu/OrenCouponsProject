import java.util.Arrays;
import javax.swing.JOptionPane;

public class IsArrayBalanced {
	public static void main(String[] args) {
		int[] array = {-100, 200, 80, 10, -5, 15};
		int sumOfArray = 0;
		int breakPoint = 0;
		boolean isArrayBalanced = false;		
		
		for (int index = 0; index < array.length; index++) {
			sumOfArray = sumOfArray + array[index];
		}

		if (sumOfArray == 0) {
			isArrayBalanced = true;
		}
		else if (sumOfArray % 2 == 0) {
			int cumulativeSum = 0;

			for (int index = 0; index < array.length; index++) {
				if (cumulativeSum == sumOfArray / 2) {
					isArrayBalanced = true;
					breakPoint = index - 1;
					break;
				}
				else {
					cumulativeSum = cumulativeSum + array[index];
				}
			}
		}

		if (isArrayBalanced) {
			JOptionPane.showMessageDialog(null, Arrays.toString(array) + " is balanced, breakpoing is at index "
					+ breakPoint, "Is array balanced", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, Arrays.toString(array) + " is not balanced", "Is array balanced",
					JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}
