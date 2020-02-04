
public class Main {
	public static void main(String[] args) {

		Matrixes matrixes = new Matrixes();

		// Execute Random Matrix 
		matrixes.randomMatrix(2);

		// Execute Is Matrix Ascending
		int[][][] matrixMocksArray = matrixes.matrixMocksArray;

		for (int matrix = 0; matrix < matrixMocksArray.length; matrix++) {
			System.out.println(matrixes.isMatrixAscending(matrixMocksArray[matrix]));
		}
	}
}
