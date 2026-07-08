package in.co.rays;

public class TestSwapUsingThreeVariable {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 0;

		System.out.println("Before Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		c = a;
		a = b;
		b = c;

		// after swapping
		System.out.println("After Swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
}
