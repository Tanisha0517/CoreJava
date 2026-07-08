package in.co.rays;

public class TestFindIndexOfNumber {
	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int number = 90;

		for (int i = 0; i < array.length; i++) {
			if (number == array[i]) {
				System.out.println(i);
			}
		}
	}
}
