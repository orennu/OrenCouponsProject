import javax.swing.JOptionPane;

public class IsPrime {
	public static void main(String[] args) {
		
		boolean isPrime = true;
		
		String strUserNum = JOptionPane.showInputDialog("Enter number");
		int userNum = Integer.parseInt(strUserNum);
		
		if (userNum > 1) {
			if (userNum <= 3) {
				isPrime = true;
			}
			else if (userNum % 2 == 0 || userNum % 3 == 0) {
				isPrime = false;
			}
			else {
				int index = 5;
				while (index * index <= userNum) {
					if (userNum % index == 0 || userNum % (index + 2) == 0) {
						isPrime = false;
					}
					else {
						index = index + 6;
					}
				}
			}
		}
		else {
			isPrime = false;
		}
		if (isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}
	}
}
