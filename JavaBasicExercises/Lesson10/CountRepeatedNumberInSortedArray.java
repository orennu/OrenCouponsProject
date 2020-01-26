import java.util.Arrays;
import javax.swing.JOptionPane;

public class CountRepeatedNumberInSortedArray {
	//	O(log(n))

	public static void main(String[] args) {

//		int[] arr = {1, 2, 2, 3, 4, 4, 4, 4, 4, 5};
		int[] arr = {3,3,3,3,3,3,3,3,3,3};
		String strNumberToSearch = JOptionPane.showInputDialog(null, "Enter a number to search",
				"Number in array counter", JOptionPane.INFORMATION_MESSAGE);
		int numberToSearch = Integer.parseInt(strNumberToSearch);
		
		JOptionPane.showMessageDialog(null, getAnswerForUser(arr, numberToSearch),
				"Number in array counter", JOptionPane.INFORMATION_MESSAGE);
	}


	private static String getAnswerForUser(int[] arr, int numberToSearch) {

		int counter = getCountOfNumbeInSortedArray(arr, numberToSearch);

		if (counter == -1) {
			String answer = numberToSearch + " is not in array " + Arrays.toString(arr);

			return answer;
		}

		String answer = numberToSearch + " repeat " + counter + " times in "+ Arrays.toString(arr);

		return answer;
	}


	private static int getCountOfNumbeInSortedArray(int[] arr, int numberToSearch) {

		int rightEdge = getIndexOfEdgeNumber(arr, numberToSearch, 1);

		if (rightEdge == -1) {
			return rightEdge;
		}
		
		int leftEdge = getIndexOfEdgeNumber(arr, numberToSearch, -1);
		int counter = (rightEdge - leftEdge) + 1;

		return counter;
	}


	private static int getIndexOfEdgeNumber(int[] array, int number, int direction) {
		
		//	O(1) break out
		if (number == array[0]) {
			if (direction != 1) {
				return 0;
			}
		}
		else if (number == array[array.length - 1]) {
			if (direction != -1) {
				return array.length - 1;
			}
		}
		
		int leftBorder = 0;
		int rightBorder = array.length - 1;
		
		while (leftBorder <= rightBorder) {
			int center = leftBorder + (rightBorder - leftBorder) / 2;
			if (number == array[center]) {
				if (center < rightBorder) {
					if (number == array[center + direction]) {
						if (direction > 0) {
							leftBorder = center + direction;
						}
						else {
							rightBorder = center + direction;
						}
					}
					else {
						return center;
					}
				}
				else {
					return center;
				}
			}
			if (number > array[center]) {
				leftBorder = center + 1;
			}
			else if (number < array[center]) {
				rightBorder = center - 1;
			}
		}

		return -1;
	}
}
