import java.util.Collections;
import java.util.Random;

public class Matrixes {
	public static void main(String[] args) {
		
		randomMatrix(2);
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
