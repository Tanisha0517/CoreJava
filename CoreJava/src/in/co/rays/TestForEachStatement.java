package in.co.rays;

public class TestForEachStatement {
	public static void main(String[] args) {
		int[] table = { 2, 4, 6, 9, 10, 12, 14, 16, 18, 20 };
		for (int v : table) {
			System.out.println("Table" + v);
		}
	}
}
