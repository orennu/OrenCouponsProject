import java.util.Random;
import javax.swing.JOptionPane;

public class GuessNumberGame {

	public static void main(String[] args) {

		final int ALLOWED_ATTEMPTS = 5;
		
		int attempts = 0;
		Random rnd = new Random();
		int randNum = rnd.nextInt(101);
				
		while (attempts <= ALLOWED_ATTEMPTS) {

			if (attempts == ALLOWED_ATTEMPTS) {
				System.out.println("You are out of guesses, the random number was " + randNum);
				attempts++;
			}
			else {
				String strUserGuess = JOptionPane.showInputDialog("Guess a number (0-100)");
				int userGuess = Integer.parseInt(strUserGuess);

				if (userGuess == randNum) {
					System.out.println("You guessed correctly on attempt #" + (attempts + 1));
					attempts = (ALLOWED_ATTEMPTS + 1);
				}
				else if (userGuess > randNum) {
					System.out.println("Your guess is higher than the random number");
					attempts++;
				}
				else if (userGuess < randNum) {
					System.out.println("Your guess is lower than the random number");
					attempts++;
				}
			}
		}
	}
}
