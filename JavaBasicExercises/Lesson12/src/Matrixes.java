import java.util.Collections;
import java.util.Random;

public class Matrixes {

	private int[][] checkAscending = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
	private int[][] checkFirstCellNotAscending = {{9, 2}, {4, 5},	{7, 8}};
	private int[][] checkLastColFirstRowNotAscending = {{1, 2, 3, 0}, {4, 5, 6, 7}, {8, 9, 10, 11}};
	private int[][] checkLastColSecondRowNotAscending = {{1, 2, 3, 4, 5}, {1, 7, 8, 9, 10}};
	private int[][] checkSecondRowNotAscending = {{1, 2, 3, 4}, {5, 0, 7, 8}, {9, 10, 11, 12}};
	private int[][] checkLastRowFirstColNotAscending = {{1, 2, 3}, {4, 5, 6}, {5, 8, 9}};
	private int[][] checkLastColLastRowNotAscending = {{1, 2}, {4, 5}, {7, 8}, {10, 6}};
	private int[][] checkAllCellsSame = {{2, 2}, {2, 2}, {2, 2}};
	public int[][][] matrixMocksArray = {this.checkAscending, this.checkFirstCellNotAscending,
			this.checkLastColFirstRowNotAscending, this.checkLastColSecondRowNotAscending,
			this.checkSecondRowNotAscending, this.checkLastRowFirstColNotAscending, 
			this.checkLastColLastRowNotAscending, this.checkAllCellsSame};
	public int[][] checkRowSumMatrix = {{10, 10, 10, 10, 10}, {13, 23, 5, 9, 20}, {100, -15, 0, 1, 1},
			{75, 28, 99, 48, 53}};


	public void randomMatrix(int size) {

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

	public boolean isMatrixAscending(int[][] matrix) {

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
	
	public void checkRowSum(int[][] matrix, int num) {
		
		for (int row = 0; row < matrix.length; row++) {
			int rowSum = 0;
			for (int col = 0; col < matrix[0].length; col++) {
				rowSum = rowSum + matrix[row][col];
				if (col == matrix[0].length - 1) {
					if (num == rowSum) {
						System.out.println("row " + (row + 1) + " sum equals given number " + num);
						return;
					}
				}
			}
		}
		System.out.println("no rows with sum " + num + " found");
	}
	
	public void checkColumnSum(int[][] matrix, int num) {

		for (int row = 0; row < matrix[0].length; row++) {
			int colSum = 0;
			for (int col = 0; col < matrix.length; col++) {
				colSum = colSum + matrix[col][row];
				if (col == matrix.length - 1) {
					if (num == colSum) {
						System.out.println("column " + (row + 1) + " sum equals given number " + num);
						return;
					}
				}
			}
		}
		System.out.println("no columns with sum " + num + " found");
	}

	public boolean isMatrixSymetricPrimaryDiagonal(int[][] matrix) {

		// code goes here

		return true;
	}

	public boolean isMatrixSymetricSecondaryDiagonal(int[][] matrix) {

		// code goes here

		return true;
	}

	private int randomThreeDigitInt() {

		Random randNum = new Random();
		int num = randNum.nextInt(899) + 100;

		return num;
	}
	
	public void prettyPrintMatrix(int[][] matrix) {
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(" " + matrix[row][col] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}