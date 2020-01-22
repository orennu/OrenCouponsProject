
public class QueenTakesMan {
	public static void main(String[] args) {
		
		
		boolean[] men = new boolean[100];
		int factor = 0;
		int counter = 100;
		
		while (counter > 1) {
			for (int index = 0; index < 100; index++) {
				if (!men[index]) {
					factor++;
					if (factor == 7) {
						men[index] = true;
						factor = 0;
						counter--;
					}
				}
			}
		}
		
		int index = 0;
		
		while (men[index]) {
			index++;
		}
		
		System.out.println("The queen chose man #" + index);
	}
}
