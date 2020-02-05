import java.util.Collections;
import java.util.Random;

public class Matrixes {

	private int[][] checkAscending = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
	private int[][] checkFirstCellNotAscending = {{9, 2}, {4, 5}, {7, 8}};
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
	public int[][] checkRowSumMatrix = {{10, 10, 10, 10, 10}, {13, 43, 5, 9, 44}, {100, -15, 0, 1, 1},
			{75, 28, 99, 48, 53}};
	public int[][] checkMatricesMultiplyFPFirstMatrix = {{1, 2}, {3, 4}};
	public int[][] checkMatricesMultiplyFPSecondMatrix = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};


	public void randomSquareMatrix(int size) {

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
	
	public boolean isMatrixAscendingRecursion(int[][] matrix, int row, int col) {
		
		
		if (row == 0 && col == 0) {
			return true;
		}		
		
		if (matrix[row][col] < matrix[row][col - 1]) {
			return false;
		}
		
		col = col - 1;
		
		if (col == 0 && row != 0) {
			if (matrix[row][col] < matrix[row - 1][matrix[0].length - 1]) {
				return false;
			}
			row = row - 1;
			col = matrix[0].length - 1;
		}
		
		return isMatrixAscendingRecursion(matrix, row, col);
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

	public int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
		
		// validate matrices can be multiplied
		if (firstMatrix[0].length != secondMatrix.length) {
			System.out.println("Error: number of columns on first matrix must equal number of rows on second matrix");
			return null;
		}
		
		int[][] dotProductMatrix = new int[firstMatrix.length][secondMatrix[0].length];
		
		for (int row = 0; row < dotProductMatrix.length; row++) {
			for (int col = 0; col < dotProductMatrix[row].length; col++) {
				dotProductMatrix[row][col] = multiplyMatricesCells(firstMatrix, secondMatrix, row, col);
			}
		}
		return dotProductMatrix;
	}

	private int multiplyMatricesCells(int[][] firstMatrix, int[][] secondMatrix, int row, int col) {
		
		int cell = 0;
		
		for (int i = 0; i < secondMatrix.length; i++) {
			cell += firstMatrix[row][i] * secondMatrix[i][col];
		}
		
		return cell;
	}

	private int randomThreeDigitInt() {

		Random randNum = new Random();
		int num = randNum.nextInt(899) + 100;

		return num;
	}
	
	private int randomNumber() {

		Random randNum = new Random();
		int num = randNum.nextInt(10);

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
	
	public int[][] randomMatrix(int rows, int cols) {
		
		int[][] matrix = new int[rows][cols];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = randomNumber();
			}
		}
		
		return matrix;
	}
	
}