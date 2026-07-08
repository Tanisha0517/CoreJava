package in.co.rays;

public class TestPalindromeNumber {
	public static void main(String[] args) {
		int digit = 121;
		System.out.println("Original Digit = " + digit);

		int reverse = 0;

		int temporary = digit;

		while (temporary > 0) {
			int rem = temporary % 10;
			reverse = (reverse * 10) + rem;
			temporary /= 10;
		}
		System.out.println("Original = " + digit + " " + "and" + " " + "Reverse = " + reverse);

		if (digit == reverse) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("Its not Palindrome");
		}
	}
}
