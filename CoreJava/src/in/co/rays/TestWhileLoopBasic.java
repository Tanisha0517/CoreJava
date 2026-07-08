package in.co.rays;

public class TestWhileLoopBasic {
	public static void main(String[] args) {
		boolean w = true;
		int round = 0;

		while (w) {
			System.out.println(round);
			if (++round > 500) {
//			System.out.println(round); --501
				w = false;
			}
		}

	}
}
