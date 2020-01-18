import java.util.Arrays;

public class MergeUnsortedArrays {

	public static int[] mergeSortedEvenArrays(int[] firstArray, int[] secondArray) {

		int[] mergedArray = new int[firstArray.length + secondArray.length];
		int counter = 0;

		for (int index = 0; index < firstArray.length; index++) {
			mergedArray[counter] = firstArray[index];
			mergedArray[counter + 1] = secondArray[index];
			counter = counter + 2;
		}
		
		int[] sortedArray = bubbleSort(mergedArray);
		
		return sortedArray;
	}


	public static int[] mergeSortedUnevenArrays(int[] firstArray, int[] secondArray) {

		int[] mergedArray = new int[firstArray.length + secondArray.length];
		int counter = 0;
		
		for (int index = 0; index < firstArray.length; index++) {
			mergedArray[index] = firstArray[index];
			counter++;
		}
		
		for (int index = 0; index < secondArray.length; index++) {
			mergedArray[counter] = secondArray[index];
			counter++;
		}

		int[] sortedArray = bubbleSort(mergedArray);
		
		return sortedArray;
	}
	
	
	public static int[] bubbleSort(int[] unsortedArray) {
		
		int[] sortedArray = {};
		int temp = 0;

		for (int i = 0; i < unsortedArray.length - 1; i++) {
			for (int j = 0; j < unsortedArray.length - i - 1; j++) {
				if (unsortedArray[j] > unsortedArray[j + 1]) {
					temp = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j + 1];
					unsortedArray[j + 1] = temp;
				}
			}
		}
		
		sortedArray = unsortedArray;
		return sortedArray;
	}


	public static void main(String[] args) {

		int[] firstEvenArray = {100,5,-76,33,1000};
		int[] secondEvenArray = {1,0,5,13,-45};

		System.out.println(Arrays.toString(mergeSortedEvenArrays(firstEvenArray, secondEvenArray)));

		
		int[] firstUnevenArray = {100,5,-76};
		int[] secondUnevenArray = {1,0,5,13,-45};

		System.out.println(Arrays.toString(mergeSortedUnevenArrays(firstUnevenArray, secondUnevenArray)));
	}
}
