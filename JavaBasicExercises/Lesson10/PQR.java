public class PQR {
	/* 	PQR using merge sort with O(n log n)
	 	https://www.youtube.com/watch?v=iMT7gTPpaqw
	*/
	public static void main(String[] args) {

		int[] arr = {9, 4, 1, 6, 20};

		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr, 0, arr.length - 1);

		boolean isQPR = checkQPRArray(arr);

		System.out.println(isQPR);
	}


	private static boolean checkQPRArray(int[] arr) {

		for (int index = 0; index < arr.length-2; index++) {
			if (arr[index] + arr[index + 1] > arr[index + 2]) {
				return true;
			}
		}

		return false;
	}
}
