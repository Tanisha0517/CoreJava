package in.co.rays;
public class TestFindSecondMax {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 35, 4, 50 };
		int secondmax = arr[0];

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondmax && arr[i] < max) {
				secondmax = arr[i];
			}

		}
		System.out.println(secondmax);

	}
}
