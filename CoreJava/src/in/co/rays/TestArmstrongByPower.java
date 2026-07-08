package in.co.rays;

public class TestArmstrongByPower {
	public static void main(String[] args) {
		String str = "153";

		int len = str.length();

		int number = Integer.parseInt(str);
		int r = 0;
		int sum = 0;
		int n = number;

		while (n > 0) {
			r = n % 10;
			sum = sum + (int) Math.pow(r, len);
			n = n / 10;
		}

		if (number == sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong number");
		}

	}
}
