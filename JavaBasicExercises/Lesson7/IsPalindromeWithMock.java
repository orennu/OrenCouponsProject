public class IsPalindromeWithMock {

	public static void main(String[] args) {

		int[] mock = {1, 2, 3, 4, 4, 3, 2, 1};
		boolean isPalindrome = true;

		for (int index = 0; index < mock.length / 2; index++) {
			if (mock[index] != mock[mock.length - 1 - index]) {
				isPalindrome = false;
				break;
			}
		}
		
		if (isPalindrome) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not plaindrome");
		}
	}
}
