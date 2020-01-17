import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class NumbersFunctions {

	public static void main(String[] args) {

		// Guess a number game
		
		guessNumberGame();
		
		// Check if 2 number contain same digits on same position
		
		int[] userNumbersArraySame = takeTwoNumbersFromUser(null);
		int firstNumSame = userNumbersArraySame[0];
		int secondNumSame = userNumbersArraySame[1];
		
		int matchingDigitsCounter = digitsOnSamePosition(firstNumSame, secondNumSame);
		JOptionPane.showMessageDialog(null, "You entered " + firstNumSame + " as 1st number.\nYou entered "
		+ secondNumSame + " as 2nd number.\nThere are " + matchingDigitsCounter +
		" matching digits on the same position.", "Matching digits on different positions",
		JOptionPane.INFORMATION_MESSAGE);
		
		
		// Check if 2 number contain same digits on different position
		
		int[] userNumbersArrayDiff = takeTwoNumbersFromUser(null);
		int firstNumDiff = userNumbersArrayDiff[0];
		int secondNumDiff = userNumbersArrayDiff[1];
		matchingDigitsCounter = digitsOnDifferentPosition(firstNumDiff, secondNumDiff);
		
		JOptionPane.showMessageDialog(null, "You entered " + firstNumDiff + " as 1st number.\nYou entered "
		+ secondNumDiff + " as 2nd number.\nThere are " + matchingDigitsCounter + 
		" matching digits on different positions.",	"Matching digits on different positions",
		JOptionPane.INFORMATION_MESSAGE);
		
		
		// Get division result of 2 numbers
		
		int[] userNumbersArrayDiv = takeTwoNumbersFromUser(null);
		int firstNumDiv = userNumbersArrayDiv[0];
		int secondNumDiv = userNumbersArrayDiv[1];

		if (secondNumDiv == 0) {
			JOptionPane.showMessageDialog(null, "Error: cannot divide by 0", "Division",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			int division = division(firstNumDiv, secondNumDiv);
			JOptionPane.showMessageDialog(null, "Division of " + firstNumDiv + " by " + secondNumDiv
					+ " is " + division, "Division", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		// Get factorial result of a number
		
		String strUserNumFact = JOptionPane.showInputDialog("Enter a number");
		int userNumFact = Integer.parseInt(strUserNumFact);
		
		if (userNumFact >= 0) {
			long factorial = factorial(userNumFact);
			JOptionPane.showMessageDialog(null, "The factorial of " + userNumFact + " is "
					+ factorial, "Factorial", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Factorial is only defined for non-negative real numbers",
					"Factorial", JOptionPane.ERROR_MESSAGE);
		}
		
		
		// Check if given array is balanced or not
		
		String strUserNumBalanced = JOptionPane.showInputDialog("How long should the array be?");
		int userNumBalanced = Integer.parseInt(strUserNumBalanced);
		int[] numArrayBalanced = takeArrayFromUser(userNumBalanced);
		boolean arrayBalanced = isArrayBalanced(numArrayBalanced);
		
		if (arrayBalanced) {
			JOptionPane.showMessageDialog(null, "Array " + Arrays.toString(numArrayBalanced) + " is balanced ",
					"Is array balanced", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Array " + Arrays.toString(numArrayBalanced) + " is not balanced",
					"Is array balanced", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		// Check if there is a duplicate digit in a given number
		
		String strUserNumDup = JOptionPane.showInputDialog("Enter a number");
		int userNumDup = Integer.parseInt(strUserNumDup);
		boolean duplicate = isDigitDuplicate(userNumDup);
		
		if (duplicate) {
			JOptionPane.showMessageDialog(null, "Found a duplicate digit in " + userNumDup,
					"Duplcate digit", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Did not find a duplicate digit in " + userNumDup,
					"Duplcate digit", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		// Check if an array is palindrome
		
		String strUserNumPali = JOptionPane.showInputDialog("How long should the array be?");
		int userNumPali = Integer.parseInt(strUserNumPali);
		int[] numArrayPali = takeArrayFromUser(userNumPali);
		
		boolean isArrayPalindrome = isArrayPalindrome(numArrayPali);
		
		if (isArrayPalindrome) {
			JOptionPane.showMessageDialog(null, "Array" + Arrays.toString(numArrayPali) + " is a palindrome",
					"Is array palindrome", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Array" + Arrays.toString(numArrayPali) + " is not a palindrome",
					"Is array palindrome", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public static int[] takeArrayFromUser(int arrayLength) {
		
		int[] numArray = new int[arrayLength];
		
		for (int index = 0; index < arrayLength; index++) {
			String strUserNum = JOptionPane.showInputDialog("Enter a number");
			int userNum = Integer.parseInt(strUserNum);
			
			numArray[index] = userNum;
			
		}
		
		return numArray;
	}
	
	
	public static int[] numberToArray(int number) {
		
		int numLength = calcLength(number);
		int[] numArray = new int[numLength];
		
		for (int index = 0; index < numLength; index++) {
			int rightDigit = number % 10;
			numArray[numLength - index - 1] = rightDigit;
			number = number / 10;
		}
		
		return numArray;
	}
	
	
	public static int[] takeTwoNumbersFromUser(String[] args) {
		
		String strFirstUserNum = JOptionPane.showInputDialog("Enter first number");
		int firstUserNum = Integer.parseInt(strFirstUserNum);
		
		String strSecondtUserNum = JOptionPane.showInputDialog("Enter second number");
		int secondUserNum = Integer.parseInt(strSecondtUserNum);
		
		int[] userNumbersArray = {firstUserNum, secondUserNum};
		
		return userNumbersArray;
	}
	
	
	public static int calcLength(int num) {

		int counter = 1;

		while (num > 9) {
			counter++;
			num = num / 10;
		}

		return counter;
	}

	
	public static void guessNumberGame() {

		final int ALLOWED_ATTEMPTS = 5;

		int attempts = 0;
		Random rnd = new Random();
		int randNum = rnd.nextInt(101);

		while (attempts <= ALLOWED_ATTEMPTS) {

			if (attempts == ALLOWED_ATTEMPTS) {
				JOptionPane.showMessageDialog(null, "You are out of guesses, the random number was "
						+ randNum, "Guess a number game", JOptionPane.INFORMATION_MESSAGE);
				attempts++;
			}
			else {
				String strUserGuess = JOptionPane.showInputDialog(null, "Guess a number (0-100)", 
						"Guess a number game", JOptionPane.INFORMATION_MESSAGE);
				int userGuess = Integer.parseInt(strUserGuess);

				if (userGuess == randNum) {
					JOptionPane.showMessageDialog(null, "You guessed correctly on attempt #"
							+ (attempts + 1), "Guess a number game", JOptionPane.INFORMATION_MESSAGE);
					attempts = (ALLOWED_ATTEMPTS + 1);
				}
				else if (userGuess > randNum) {
					JOptionPane.showMessageDialog(null, "Attempt #" + (attempts + 1) + "\n" +
							" Your guess is higher than the random number", "Guess a number game",
							JOptionPane.INFORMATION_MESSAGE);
					attempts++;
				}
				else if (userGuess < randNum) {
					JOptionPane.showMessageDialog(null, "Attempt #" + (attempts + 1) + "\n" +
							" Your guess is lower than the random number", "Guess a number game",
							JOptionPane.INFORMATION_MESSAGE);
					attempts++;
				}
			}
		}
	}

	
	public static int digitsOnSamePosition(int firstNum, int secondNum) {

		int matchingDigitsCounter = 0;
		int numLength = calcLength(firstNum);

		for (int index = 0; index < numLength; index++) {
			int firstNumRightDigit = firstNum % 10;
			int secondNumRightDigit = secondNum % 10;

			if (firstNumRightDigit == secondNumRightDigit) {
				matchingDigitsCounter++;
			}

			firstNum = firstNum / 10;
			secondNum = secondNum / 10;
		}
		
		return matchingDigitsCounter;
	}
	
	
	public static int digitsOnDifferentPosition(int firstNum, int secondNum) {
		
		int numLength = calcLength(firstNum);
		int[] secondNumArray = new int[numLength];

		for (int index = 0; index < numLength; index++) {
			int secondNumRightDigit = secondNum % 10;
			secondNumArray[index] = secondNumRightDigit;
			secondNum = secondNum / 10;
		}

		int matchingDigitsCounter = 0;

		for (int index = 0; index < numLength; index++) {
			int firstNumRightDigit = firstNum % 10;
			if (firstNumRightDigit != secondNumArray[index]) {
				for (int index2 = 0; index2 < numLength; index2++) {
					if (firstNumRightDigit == secondNumArray[index2]) {
						matchingDigitsCounter++;
					}
				}
			}
			firstNum = firstNum / 10;
		}
		
		return matchingDigitsCounter;
	}
	
	
	public static int division(int numerator, int denumerator) {
		
		int userNumerator = numerator;
		int division = 0;
		
		while (Math.abs(numerator) >= Math.abs(denumerator)) {
			numerator = Math.abs(numerator) - Math.abs(denumerator);
			division++;
		}
		
		if (userNumerator < 0 ^ denumerator < 0) {
			return -division;
		}
		else {
			return division;
		}
	}
	
	
	public static long factorial(int number) {
		
		long factorial = number;

		if (number > 1) {
			for (int index = number; index > 2; index--) {
				factorial = factorial * (index -1);
			}
		}
		else {
			return 1;
		}
		return factorial;
	}
	
	
	public static boolean isArrayBalanced(int[] array) {
		
		int sumOfArray = 0;
		boolean isArrayBalanced = false;		
		
		for (int index = 0; index < array.length; index++) {
			sumOfArray = sumOfArray + array[index];
		}

		if (sumOfArray == 0) {
			isArrayBalanced = true;
		}
		else if (sumOfArray % 2 == 0) {
			int cumulativeSum = 0;

			for (int index = 0; index < array.length; index++) {
				if (cumulativeSum == sumOfArray / 2) {
					isArrayBalanced = true;
					return isArrayBalanced;
				}
				else {
					cumulativeSum = cumulativeSum + array[index];
				}
			}
		}
		
		return isArrayBalanced;
	}
	
	
	public static boolean isDigitDuplicate(int number) {
		
		boolean[] digitsArray = new boolean[10];
		boolean duplicate = false;
		
		while (number > 0 && !duplicate) {
			int rightDigit = number % 10;
			number = number /10;
			if (digitsArray[rightDigit]) {
				duplicate = true;
			}
			else {
				digitsArray[rightDigit] = true;
			}
		}
		
		return duplicate;
	}
	
	
	public static boolean isArrayPalindrome(int[] numArray) {
		
		boolean isPalindrome = true;

		for (int index = 0; index < numArray.length / 2; index++) {
			if (numArray[index] != numArray[numArray.length - 1 - index]) {
				isPalindrome = false;
				return isPalindrome;
			}
		}
		
		return isPalindrome;
	}
}