package in.co.rays;

public class TestFibonacciseries {

	public static void main(String[] args) {
//		0 1 1 2 3 5 8 13 21
		int n1 = 0;
		int n2 = 1;
		int a;

		for (int i = 0; i <= 10; i++) {
			a = n1 + n2;

			n1 = n2;
			n2 = a;

			System.out.println(n1);
		}
	}

}
