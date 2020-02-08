import java.util.Arrays;
import javax.swing.JOptionPane;

public class MainLesson12 {
	public static void main(String[] args) {

		Matrixes matrixes = new Matrixes();

//		// Execute Random Matrix
//		System.out.println("Random 2x2 Matrix\n==================");
//		matrixes.randomSquareMatrix(2);
//
//		// Execute Is Matrix Ascending
//		System.out.println("\nCheck if matrixes ascending\n============================");
//		int[][][] matrixMocksArray = matrixes.matrixMocksArray;
//
//		
//		for (int matrix = 0; matrix < matrixMocksArray.length; matrix++) {
//			System.out.println(Arrays.deepToString(matrixMocksArray[matrix]) + ": "
//					+ matrixes.isMatrixAscending(matrixMocksArray[matrix]));
//		}
//
//		// Execute find row with sum of given number
//		int[][] checkRowSumMatrix = matrixes.checkRowSumMatrix;
//		String strNum = JOptionPane.showInputDialog("Enter number to check");
//		int num = Integer.parseInt(strNum);
//		
//		System.out.println("\nCheck if number equals to row sum in matrix\n============================================");
//		System.out.println("On matrix\n");
//		matrixes.prettyPrintMatrix(checkRowSumMatrix);
//		matrixes.checkRowSum(checkRowSumMatrix, num);
//
//		// Execute find column with sum of given number
//		System.out.println("\nCheck if number equals to column sum in matrix\n===============================================");
//		System.out.println("On matrix\n");
//		matrixes.prettyPrintMatrix(checkRowSumMatrix);
//		matrixes.checkColumnSum(checkRowSumMatrix, num);
		
		// Execute check if matrix symmetric in relation to primary diagonal
		int[][] checkMatrixSymmetricPrimaryDiagonal = matrixes.checkMatrixSymmetricPrimaryDiagonal;
		System.out.println("\ncheck if matrix symmetric in relation to primary diagonal\n=====================================================");
		matrixes.prettyPrintMatrix(checkMatrixSymmetricPrimaryDiagonal);
		System.out.println(matrixes.isMatrixSymmetricPrimaryDiagonal(checkMatrixSymmetricPrimaryDiagonal));
		
		//Execute check if matrix symmetric in relation to secondary diagonal
		int[][] checkMatrixSymmetricSecondaryDiagonal = matrixes.checkMatrixSymmetricSecondaryDiagonal;
		System.out.println("\ncheck if matrix symmetric in relation to secondary diagonal\n=====================================================");
		matrixes.prettyPrintMatrix(checkMatrixSymmetricSecondaryDiagonal);
		System.out.println(matrixes.isMatrixSymetricSecondaryDiagonal(checkMatrixSymmetricSecondaryDiagonal));
	}
}
