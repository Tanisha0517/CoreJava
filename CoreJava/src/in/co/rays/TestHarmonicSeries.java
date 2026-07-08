package in.co.rays;
//Harmonic Series = 1/1 + 1/2 + 1/3 + 1/4 + 1/5

public class TestHarmonicSeries {
	public static void main(String[] args) {
		int n = 8;

		for (int i = 1; i <= n; i++) {

			if (i == n) {
				System.out.print("1/" + i);
			} else {
				System.out.print("1/" + i + " + ");
			}
		}
	}
}
