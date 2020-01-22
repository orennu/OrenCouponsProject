public class MergeSort {

	void merge(int[] arr, int begin, int center, int end) {

		int leftBorder = center - begin + 1;
		int rightBorder = end - center;

		int[] leftArr = new int[leftBorder];
		int[] rightArr = new int[rightBorder];

		for (int index = 0; index < leftBorder; index++) {
			leftArr[index] = arr[begin + index];
		}

		for (int index = 0; index < rightBorder; index++) {
			rightArr[index] = arr[center + 1 + index];
		}

		int index1 = 0;
		int index2 = 0;
		int index3 = begin;

		while (index1 < leftBorder && index2 < rightBorder) {
			if (leftArr[index1] <= rightArr[index2]) {
				arr[index3] = leftArr[index1];
				index1++;
			}
			else {
				arr[index3] = rightArr[index2];
				index2++;
			}

			index3++;
		}

		while (index1 < leftBorder) {
			arr[index3] = leftArr[index1];
			index1++;
			index3++;
		}

		while (index2 < rightBorder) {
			arr[index3] = rightArr[index2];
			index2++;
			index3++;
		}
	}
	

	void sort(int[] arr, int begin, int end) {

		if (begin < end) {
			int center = (begin + end) / 2;

			sort(arr, begin, center);
			sort(arr, center + 1, end);
			merge(arr, begin, center, end);
		}
	}
}