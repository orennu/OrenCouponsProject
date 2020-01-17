import javax.swing.JOptionPane;

/** Take 2 grades as input from user and output average grade and result.
 */
public class AverageGradesResult {

	public static void main(String[] args) {
		
		int sumGrades = 0;
		int index = 0;
		
		for (index = 0; index < 2; index++) {
			
			String strGrade = JOptionPane.showInputDialog("Enter your grade");
			int grade = Integer.parseInt(strGrade);
			sumGrades = sumGrades + grade;
			
		}
		
		int average = sumGrades / index;
		
		if (average >= 60) {
			JOptionPane.showMessageDialog(null, "Your average grade is " 
					+ average + ", you PASSED", "Average", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your average grade is " 
					+ average + ", you FAILED", "Average", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
