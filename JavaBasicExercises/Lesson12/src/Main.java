import java.util.Arrays;
import javax.swing.JOptionPane;

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

		// Execute find row with sum of given number
		int[][] checkRowSumMatrix = matrixes.checkRowSumMatrix;
		String strNum = JOptionPane.showInputDialog("Enter number to check");
		int num = Integer.parseInt(strNum);
		System.out.println("\nCheck if number equals to row sum in matrix\n============================================");
		System.out.println("On matrix\n");
		matrixes.prettyPrintMatrix(checkRowSumMatrix);
		matrixes.checkRowSum(checkRowSumMatrix, num);

		// Execute find column with sum of given number
		System.out.println("\nCheck if number equals to column sum in matrix\n============================================");
		System.out.println("On matrix\n");
		matrixes.prettyPrintMatrix(checkRowSumMatrix);
		matrixes.checkColumnSum(checkRowSumMatrix, num);
	}
}
