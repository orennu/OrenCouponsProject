import java.math.BigInteger;
import javax.swing.JOptionPane;

/** Take 2 numbers as input from user and output their product in kids' format. 
*/
public class MultiplyForKids {

	public static void main(String[] args) {
		
		String strNum1 = JOptionPane.showInputDialog("Enter a number");
		BigInteger num1 = new BigInteger(strNum1);

		String strNum2 = JOptionPane.showInputDialog("Enter a second number");
		BigInteger num2 = new BigInteger(strNum2);
		
		BigInteger product = num1.multiply(num2);
		
		JOptionPane.showMessageDialog(null, num1 + " x " + num2 + " = " + product, "Product", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(num1 + " x " + num2 + " = " + product);
		
	}

}
