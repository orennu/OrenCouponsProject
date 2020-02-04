import java.util.Collections;
import java.util.Random;

public class Matrixes {
	public static void main(String[] args) {

		// Execute Random Matrix 
		randomMatrix(2);

		// Execute Is Matrix Ascending

		MatrixMocks matrixMocks = new MatrixMocks();
		int[][] checkAscending = matrixMocks.checkAscending;
		int[][] checkFirstCellNotAscending = matrixMocks.checkFirstCellNotAscending;
		int[][] checkLastColFirstRowNotAscending = matrixMocks.checkLastColFirstRowNotAscending;
		int[][] checkLastColSecondRowNotAscending = matrixMocks.checkLastColSecondRowNotAscending;
		int[][] checkSecondRowNotAscending = matrixMocks.checkSecondRowNotAscending;
		int[][] checkLastRowFirstColNotAscending = matrixMocks.checkLastRowFirstColNotAscending;
		int[][] checkLastColLastRowNotAscending = matrixMocks.checkLastColLastRowNotAscending;
		int[][] checkAllCellsSame = matrixMocks.checkAllCellsSame;

		int[][][] matrixMocksArray = {checkAscending, checkFirstCellNotAscending, 
				checkLastColFirstRowNotAscending, checkLastColSecondRowNotAscending, 
				checkSecondRowNotAscending, checkLastRowFirstColNotAscending,
				checkLastColLastRowNotAscending, checkAllCellsSame};

		for (int matrix = 0; matrix < matrixMocksArray.length; matrix++) {
			System.out.println(isMatrixAscending(matrixMocksArray[matrix]));
		}
	}

	public static void randomMatrix(int size) {

		int matrix[][] = new int[size][size];

		for (int row = 0; row < matrix.length; row++) {
			System.out.println(String.join("", Collections.nCopies((size * 6) + 1, "-")));
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = randomThreeDigitInt();
				System.out.print("| " + matrix[row][col] + " ");
			}
			System.out.println("|");
		}
		System.out.println(String.join("", Collections.nCopies((size * 6) + 1, "-")));
	}

	public static boolean isMatrixAscending(int[][] matrix) {

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length - 1; col++) {
				if (row != matrix.length - 1) {
					if (matrix[row][col] > matrix[row][col + 1]) {
						return false;
					}
					else if (matrix[row + 1][0] < matrix[row][col + 1]) {
						return false;
					}
				}
				else if (matrix[row][col] > matrix[row][col + 1]) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isMatrixSymetricPrimaryDiagonal(int[][] matrix) {

		// code goes here

		return true;
	}

	public static boolean isMatrixSymetricSecondaryDiagonal(int[][] matrix) {

		// code goes here

		return true;
	}

	private static int randomThreeDigitInt() {

		Random randNum = new Random();
		int num = randNum.nextInt(899) + 100;

		return num;
	}
}
