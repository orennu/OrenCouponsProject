import java.util.Random;

import javax.swing.JOptionPane;

public class GuessNumberGame {

	public static void main(String[] args) {

		int attempts = 0;
		Random rnd = new Random();
		int randNum = rnd.nextInt(101);

		while (attempts <= 5) {

			if (attempts == 5) {
				System.out.println("You are out of guesses, the random number was " + randNum);
				attempts++;
			}
			else {
				String strUserGuess = JOptionPane.showInputDialog("Guess a number (0-100)");
				int userGuess = Integer.parseInt(strUserGuess);

				if (userGuess == randNum) {
					System.out.println("You guessed correctly on attempt #" + (attempts + 1));
					attempts = 6;
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
