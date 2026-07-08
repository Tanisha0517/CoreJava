//Find average of consecutive n odd numbers and even numbers

package in.co.rays;

public class TestAverageEvenOdd {
    public static void main(String[] args) {

        int n = 5; // Number of even and odd numbers required

        int evenSum = 0;
        int oddSum = 0;

        int evenCount = 0;
        int oddCount = 0;

        int i = 1;

        System.out.println("Even Numbers:");

        while (evenCount < n) {

            if (i % 2 == 0) {
                System.out.println(i);
                evenSum = evenSum + i;
                evenCount++;
            }

            i++;
        }

        System.out.println("Sum of Even Numbers = " + evenSum);
        System.out.println("Average of Even Numbers = " + (double) evenSum / evenCount);

        System.out.println("----------------------------");

        i = 1;

        System.out.println("Odd Numbers:");

        while (oddCount < n) {

            if (i % 2 != 0) {
                System.out.println(i);
                oddSum = oddSum + i;
                oddCount++;
            }

            i++;
        }

        System.out.println("Sum of Odd Numbers = " + oddSum);
        System.out.println("Average of Odd Numbers = " + (double) oddSum / oddCount);
    }
}
