
import javax.swing.JOptionPane;

public class Modulo {
	public static void main(String[] args) {
		
		String strNumerator = JOptionPane.showInputDialog("Enter a number for numerator");
		int numerator = Integer.parseInt(strNumerator);
		String strDenumerator = JOptionPane.showInputDialog("Enter a number for denumerator");
		int denumerator = Integer.parseInt(strDenumerator);
		
		if (denumerator == 0) {
			System.out.println("cannot divide by 0");
			denumerator = 0;
		}
		
		int userNumerator = numerator;
		int division = 0;
		
		while (Math.abs(numerator) >= Math.abs(denumerator)) {
			numerator = Math.abs(numerator) - Math.abs(denumerator);
			division++;
		}
		
		if (userNumerator < 0 || denumerator < 0) {
			System.out.println("negative numbers are not supported");
		}
		else {
			System.out.println(numerator);
		}
	}
}
