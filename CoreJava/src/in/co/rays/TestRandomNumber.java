package in.co.rays;

public class TestRandomNumber {
	public static void main(String[] args) {
		
		  
		        for (int i = 1; i <= 5; i++) {

		            // Generate a random integer between 1 and 100
		        	// (int)(Math.random() * (max - min + 1)) + min
		            int random = (int)(Math.random() * 100) + 1;

		            System.out.println(random);
		        }
		    }
		
	}

