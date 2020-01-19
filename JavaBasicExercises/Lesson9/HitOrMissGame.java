import java.util.Random;

import javax.swing.JOptionPane;

public class HitOrMissGame {

	public static void main(String[] args) {

		int difficultyLevel = getValidDifficultyLevel();
		int maxAmountOfGuesses = getAmountOfGuessesByDifficultyLevel(difficultyLevel);
		int computerNumber = generateValidComputerNumber();

		int currentRound = 1;
		boolean isUserWon = false;

		// 1st condition : I didn't run out of guesses
		// 2nd condition : I didn't win
		while(currentRound <= maxAmountOfGuesses && !isUserWon) {
			int userGuess = getValidUserGuess();
			int amountOfHits = calcAmountOfHits(computerNumber, userGuess);

			if (amountOfHits == 4) {
				isUserWon = true;
			}
			else {
				int amountOfNearHits = calcAmountOfNearHits(computerNumber, userGuess);
				System.out.println("Round #" + currentRound + " Guess: " + userGuess + " Hits:" + amountOfHits +
						" Near hits:" + amountOfNearHits);
				currentRound++;
			}
		}

		if (isUserWon) {
			JOptionPane.showMessageDialog(null, "Yay ! you won !!");
		}
		else {
			JOptionPane.showMessageDialog(null, "It's ok, high tech isn't for everyone, "
					+ "consider Lak + Gel\n" + "num = " + computerNumber);
		}
	}
	

	private static int calcAmountOfHits(int computerNumber, int userGuess) {
		
		int matchingDigitsCounter = 0;
		int numLength = calcLength(computerNumber);

		for (int index = 0; index < numLength; index++) {
			int firstNumRightDigit = computerNumber % 10;
			int secondNumRightDigit = userGuess % 10;

			if (firstNumRightDigit == secondNumRightDigit) {
				matchingDigitsCounter++;
			}

			computerNumber = computerNumber / 10;
			userGuess = userGuess / 10;
		}
		
		return matchingDigitsCounter;
	}
	

	private static int calcAmountOfNearHits(int computerNumber, int userGuess) {

		int numLength = calcLength(computerNumber);
		int[] secondNumArray = new int[numLength];

		for (int index = 0; index < numLength; index++) {
			int secondNumRightDigit = userGuess % 10;
			secondNumArray[index] = secondNumRightDigit;
			userGuess = userGuess / 10;
		}

		int matchingDigitsCounter = 0;

		for (int index = 0; index < numLength; index++) {
			int firstNumRightDigit = computerNumber % 10;
			if (firstNumRightDigit != secondNumArray[index]) {
				for (int index2 = 0; index2 < numLength; index2++) {
					if (firstNumRightDigit == secondNumArray[index2]) {
						matchingDigitsCounter++;
					}
				}
			}
			computerNumber = computerNumber / 10;
		}

		return matchingDigitsCounter;
	}


	private static int calcLength(int computerNumber) {

		int counter = 1;

		while (computerNumber > 9) {
			counter++;
			computerNumber = computerNumber / 10;
		}

		return counter;
	}


	private static int getValidUserGuess() {

		String strUserGuess = JOptionPane.showInputDialog("Please enter a 4 digit number\n "
				+ "Note: all digits must be unique.");
		int userGuess = Integer.parseInt(strUserGuess);

		while (!isDigitsUnique(userGuess) || strUserGuess.length() != 4) {
			strUserGuess = JOptionPane.showInputDialog("Invalid number entered, should be unique 4 digit number\n"
					+ "Please enter a 4 digit number\n "
					+ "Note: all digits must be unique.");
			userGuess = Integer.parseInt(strUserGuess);
		}

		return userGuess;
	}


	private static int generateValidComputerNumber() {

		Random rnd = new Random();
		int computerNumber = rnd.nextInt(8854) + 1023;

		while(!isDigitsUnique(computerNumber)) {
			computerNumber = rnd.nextInt(8854) + 1023;
		}
		
		return computerNumber;
	}


	private static boolean isDigitsUnique(int computerNumber) {

		boolean[] digitsArray = new boolean[10];

		while (computerNumber > 0) {
			int rightDigit = computerNumber % 10;

			if (digitsArray[rightDigit]) {
				return false;
			}

			digitsArray[rightDigit] = true;
			computerNumber = computerNumber / 10;
		}

		return true;
	}


	private static int getAmountOfGuessesByDifficultyLevel(int difficultyLevel) {

		if (difficultyLevel == 1) {
			return 12;
		}

		if (difficultyLevel == 2) {
			return 9;
		}

		return 7;
	}

	private static int getValidDifficultyLevel() {

		String strDifficultyLevel = JOptionPane.showInputDialog("Please choose difficulty level : \n" +
				"1.Easy - 12 guesses\n" +
				"2.Medium - 9 guesses\n" +
				"3.Hard - 7 guesses");
		int difficultyLevel = Integer.parseInt(strDifficultyLevel);

		while(difficultyLevel < 1 || difficultyLevel > 3) {
			strDifficultyLevel = JOptionPane.showInputDialog("Invalid number, should be 1-3\n"
					+ "Please choose difficulty level : \n" +
					"1.Easy - 12 guesses\n" +
					"2.Medium - 9 guesses\n" +
					"3.Hard - 7 guesses");
			difficultyLevel = Integer.parseInt(strDifficultyLevel);
		}

		return difficultyLevel;
	}
}
