import javax.swing.JOptionPane;

public class SquareMatrix {
	public static void main(String[] args) {
		String strCellNum = JOptionPane.showInputDialog("Enter cell number");
		int cellNum = Integer.parseInt(strCellNum);

		int rootNum = 0;
		int squareMatrix = 0;

		while (squareMatrix < cellNum) {
			rootNum++;
			squareMatrix = rootNum * rootNum;
		}
		System.out.println(squareMatrix);
	}
}
