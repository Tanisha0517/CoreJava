package in.co.rays;

public class TestPrintTableArray {
	public static void main(String[] args) {

		int n = 5; // Fixed number
		int[] table = new int[10];

		// Store the table in the array
		for (int i = 0; i < 10; i++) {
			table[i] = n * (i + 1);
		}

		// Print the table
		for (int i = 0; i < 10; i++) {
			System.out.println(n + " x " + (i + 1) + " = " + table[i]);
		}
	}
}
