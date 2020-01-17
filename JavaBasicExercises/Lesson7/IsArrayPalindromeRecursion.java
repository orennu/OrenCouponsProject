
public class IsArrayPalindromeRecursion {
	public static boolean isPalindrome(int[] array, int start, int end) {
		
	    if(array.length == 0 || array.length == 1)
	        return true;

	    if(start >= end)
	        return true;

	    if(array[start] != array[end])
	        return false;

	    return isPalindrome(array, start + 1, end -1);
	}
	
	public static void main(String[] args) {
		
		int[] mock = {5, 8, 7, 7, 7, 8, 5};
		if (isPalindrome(mock, 0, mock.length-1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}
