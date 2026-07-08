package in.co.rays;

public class TestPrimeNumber {
	public static void main(String[] args) {
		int num = 15;
		int count = 0;

		for (int i = 1; i < 10; i++) {

			if (num % i == 0) {
				count++; // increase factor count
			}
		}

		// After loop
		// count = 2

		if (count == 2) {
			System.out.println("It is a Prime Number");
		} else {
			System.out.println("It is NOT a Prime Number");
		}

	}
}
