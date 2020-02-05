import java.util.Arrays;
import javax.swing.JOptionPane;

public class MainLesson13 {
	public static void main(String[] args) {

		Matrixes matrixes = new Matrixes();
		
		// Execute multiply matrices
		String strRowCol = JOptionPane.showInputDialog("Enter number of rows on first matrix"
				+ "\n and columns on second matrix");
		String strColRow = JOptionPane.showInputDialog("Enter number of columns on first matrix"
				+ "\n and rows on second matrix");
		int rowCol = Integer.parseInt(strRowCol);
		int colRow = Integer.parseInt(strColRow);

		int[][] firstMatrix = matrixes.randomMatrix(rowCol, colRow);
		int[][] secondMatrix = matrixes.randomMatrix(colRow, rowCol);
		int[][] dotMultiplyMatrix = matrixes.multiplyMatrices(firstMatrix, secondMatrix);
		int[][] checkMatricesMultiplyFPFirstMatrix = matrixes.checkMatricesMultiplyFPFirstMatrix;
		int[][] checkMatricesMultiplyFPSecondMatrix = matrixes.checkMatricesMultiplyFPSecondMatrix;

		System.out.println("\nMatrices multiplication\n========================");
		System.out.println("First matrix\n=============");
		matrixes.prettyPrintMatrix(firstMatrix);
		System.out.println("second matrix\n=============");
		matrixes.prettyPrintMatrix(secondMatrix);
		System.out.println("dot product matrix\n===================");
		matrixes.prettyPrintMatrix(dotMultiplyMatrix);

		System.out.println("\nCheck matrices multiplication FP\n=================================");
		System.out.println("First matrix\n=============");
		matrixes.prettyPrintMatrix(checkMatricesMultiplyFPFirstMatrix);
		System.out.println("second matrix\n=============");
		matrixes.prettyPrintMatrix(checkMatricesMultiplyFPSecondMatrix);
		matrixes.multiplyMatrices(checkMatricesMultiplyFPFirstMatrix, checkMatricesMultiplyFPSecondMatrix);
		
		System.out.println("\nCheck if matrixes ascending recursion\n=====================================");
		int[][][] matrixMocksArray = matrixes.matrixMocksArray;

		for (int matrix = 0; matrix < matrixMocksArray.length; matrix++) {
			int row = matrixMocksArray[matrix].length - 1;
			int col = matrixMocksArray[matrix][0].length - 1;
			System.out.println(Arrays.deepToString(matrixMocksArray[matrix]) + ": "
					+ matrixes.isMatrixAscendingRecursion(matrixMocksArray[matrix], row, col));
		}
	}
}
