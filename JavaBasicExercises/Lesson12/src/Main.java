import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		Matrixes matrixes = new Matrixes();

		// Execute Random Matrix
		System.out.println("Random 2x2 Matrix\n===========================");
		matrixes.randomMatrix(2);

		// Execute Is Matrix Ascending
		System.out.println("\nCheck if matrixes ascending\n===========================");
		int[][][] matrixMocksArray = matrixes.matrixMocksArray;

		for (int matrix = 0; matrix < matrixMocksArray.length; matrix++) {
			System.out.println(Arrays.deepToString(matrixMocksArray[matrix]) + ": "
					+ matrixes.isMatrixAscending(matrixMocksArray[matrix]));
		}
	}
}
