import java.util.Arrays;
import javax.swing.JOptionPane;

public class MergeSortedArrays {

	public static int[] mergeSortedArrays(int[] firstArray, int[] secondArray) {

		int firstArrayLength = firstArray.length;
		int secondArrayLength = secondArray.length;
		int[] mergedArray = new int[firstArrayLength + secondArrayLength];

		int firstArrayCounter = 0;
		int secondArrayCounter = 0;
		int mergedArrayCounter = 0;

		while (firstArrayCounter < firstArrayLength && secondArrayCounter < secondArrayLength) {
			if (firstArray[firstArrayCounter] < secondArray[secondArrayCounter]) {
				mergedArray[mergedArrayCounter] = firstArray[firstArrayCounter];
				mergedArrayCounter++;
				firstArrayCounter++;
			}
			else {
				mergedArray[mergedArrayCounter] = secondArray[secondArrayCounter];
				mergedArrayCounter++;
				secondArrayCounter++;
			}
		}

		while (firstArrayCounter < firstArrayLength) {
			mergedArray[mergedArrayCounter] = firstArray[firstArrayCounter];
			mergedArrayCounter++;
			firstArrayCounter++;
		}

		while (secondArrayCounter < secondArrayLength) {
			mergedArray[mergedArrayCounter] = secondArray[secondArrayCounter];
			mergedArrayCounter++;
			secondArrayCounter++;
		}
		
		return mergedArray;
	}
	
	public static void main(String[] args) {
		
		int[] firstArray = {0, 1, 2, 5, 7, 10, 100};
		int[] secondArray = {3, 4, 6, 8, 9, 200};
		
		int[] mergedArray = mergeSortedArrays(firstArray, secondArray);
		JOptionPane.showMessageDialog(null, "First array: " + Arrays.toString(firstArray) + "\n" +
				"Second array: " + Arrays.toString(secondArray) + "\n" + "Merged array: " + 
				Arrays.toString(mergedArray) ,"Merged Array", JOptionPane.INFORMATION_MESSAGE);
	}
}
