package in.co.rays;

public class TestArmstrong {

	public static void main(String[] args) {
        int number = 153;
        
        int a = number % 10;
        int b = (number / 10) % 10;
        int c = number / 100;
        
        int sum = a*a*a + b*b*b + c*c*c;
        
        if(sum==number) {
        	System.out.println("Number is Armstrong number");
        }
        else {
        	System.out.println("Number is not Armstrong number");
        }
	}
}


