import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
//		sysout = OUTPUT
		/*
		System.out.println("Hello");
		
		int x = 1;
		System.out.println(x);
		*/
		
//		Input1
		String strNum1 = JOptionPane.showInputDialog("Please enter a number");
		
//		Conversion from string to integer strNum1 --> num1
		int num1 = Integer.parseInt(strNum1);

//		Input2
		String strNum2 = JOptionPane.showInputDialog("Please enter a second number");
		
//		Conversion from string to integer strNum2 --> num2
		int num2 = Integer.parseInt(strNum2);
		
		int answer = num1 + num2;
		
		System.out.println(answer);
		
	}
}
