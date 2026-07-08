//Write a Java program to find the minimum number of currency notes required for a given amount using 
//the denominations 200, 100, 50, and 10.
//Suppose amount be 2500

package in.co.rays;

public class TestAmount {
	public static void main(String[] args) {
		int amount = 2500;
		int array[] = { 200, 100, 50, 10 };

		for (int i = 0; i < array.length; i++) {

			if (amount >= array[i]) { // 2500>200

				int count = amount / array[i]; // 2500/200 = 12         100/100 =1

				System.out.println(array[i] + " = " + count); //200=12    //100=1

				amount = amount % array[i]; // 2500%200=100             100%100=0
			}
		}

	}
}
