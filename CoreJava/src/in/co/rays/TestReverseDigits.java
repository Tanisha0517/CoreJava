package in.co.rays;

public class TestReverseDigits {
	public static void main(String[] args) {
		int digit = 123;
		System.out.println("Original Digit = " + digit);

		int reverse = 0;

		int temporary = digit;

		while (temporary > 0) { // 123>0 //12>0 //1>0 //0>0 false
			int rem = temporary % 10; // 123%10 =3 // 12%10=2 // 1%10=1
			reverse = (reverse * 10) + rem; // (0*10)+3=3 // (3*10)+2=32 // (32*10)+1=321
			temporary /= 10; // 123/10=12 //12/10=1 //1/10=0 so
		}

		System.out.println("Reversed Digit = " + reverse);
	}
}
