import javax.swing.JOptionPane;

public class PermutationNumber {

	public static int numberLength(int number) {

		int numOfDigits = 1;
		
		while (number > 9) {
			number = number / 10;
			numOfDigits++;
		}

		return numOfDigits;
	}

	public static void main(String[] args) {

		boolean isPermutation = true;
		int[] array = new int[10];

		String strFirstNum = JOptionPane.showInputDialog("Enter 1st number");
		int firstNum = Integer.parseInt(strFirstNum);
		int numOfDigits = numberLength(firstNum);

		for (int index = 0; index < numOfDigits; index++) {
			int rightDigit = firstNum % 10;
			array[rightDigit]++;
			firstNum = firstNum / 10;
		}

		String strSecondNum = JOptionPane.showInputDialog("Enter 2nd number");
		int secondNum = Integer.parseInt(strSecondNum);
		numOfDigits = numberLength(secondNum);

		for (int index = 0; index < numOfDigits; index++) {
			int rightDigit = secondNum % 10;
			if (array[rightDigit] != 0) {
				array[rightDigit]--;
				secondNum = secondNum / 10;
			}
			else {
				isPermutation = false;
			}
		}

		for (int index = 0; index < array.length; index++) {
			if (array[index] != 0) {
				isPermutation = false;
			}
		}

		if (isPermutation) {
			System.out.println("Permutation");
		}
		else {
			System.out.println("Not permutation");
		}
	}
}
