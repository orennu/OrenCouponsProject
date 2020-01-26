import javax.swing.JOptionPane;

public class BinarySearch {

	public static boolean binarySearch(int[] array, int number) {

		boolean isNumberFound = false;
		int leftBorder = 0;
		int rightBorder = array.length - 1;

		while (leftBorder <= rightBorder) {
			int center = leftBorder + (rightBorder - leftBorder) / 2;
			if (number == array[center]) {
				isNumberFound = true;
				return isNumberFound;
			}
			if (number > array[center]) {
				leftBorder = center + 1;
			}
			else {
				rightBorder = center - 1;
			}
		}

		return isNumberFound;
	}


	public static int[] takeArrayFromUser(int arrayLength) {

		int[] numArray = new int[arrayLength];

		for (int index = 0; index < arrayLength; index++) {
			String strUserNum = JOptionPane.showInputDialog(null, "Enter a number",
					"Binary search", JOptionPane.INFORMATION_MESSAGE);
			int userNum = Integer.parseInt(strUserNum);

			numArray[index] = userNum;

		}

		return numArray;
	}


	public static int[] generateSortedArray(int arrayLength) {

		int[] numArray = new int[arrayLength];

		for (int index = 0; index < arrayLength; index++) {
			numArray[index] = index + 1;
		}

		return numArray;
	}


	public static void main(String[] args) {

		int[] arr = {};

		String strArrayLength = JOptionPane.showInputDialog(null, "Enter array length",
				"Binary search", JOptionPane.INFORMATION_MESSAGE);
		int arrayLength = Integer.parseInt(strArrayLength);

		int userArrayTypeSelection = JOptionPane.showConfirmDialog(null, "Generate an array? (Y/N)",
				"Binary search", JOptionPane.INFORMATION_MESSAGE);
		if (userArrayTypeSelection == JOptionPane.YES_OPTION) {
			arr = generateSortedArray(arrayLength);
		}
		else if (userArrayTypeSelection == JOptionPane.NO_OPTION) {
			arr = takeArrayFromUser(arrayLength);
		}
		else {
			JOptionPane.showMessageDialog(null, "Expected Y/y/N/n got "	+ userArrayTypeSelection,
					"Binary search", JOptionPane.ERROR_MESSAGE);
			return;
		}

		String strNum = JOptionPane.showInputDialog(null, "Enter number to search",
				"Binary search", JOptionPane.INFORMATION_MESSAGE);
		int num = Integer.parseInt(strNum);

		boolean isNumberFound = binarySearch(arr, num);

		if (isNumberFound) {
			JOptionPane.showMessageDialog(null, "Found " + num + " in sorted array ("
					+ arr[0] + "-" + arr[arrayLength - 1] + ")", "Binary search", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Did not find " + num + " in sorted array ("
					+ arr[0] + "-" + arr[arrayLength - 1] + ")", "Binary search", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
