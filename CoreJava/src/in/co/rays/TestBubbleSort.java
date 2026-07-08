package in.co.rays;

public class TestBubbleSort {

    public static void main(String[] args) {

        int array[] = {90, 50, 80, 70, 30};
        int swap;

       // Its outer loop handles Number of passes
        for (int i = 0; i < array.length - 1; i++) {

            // Its Inner loop Compare adjacent elements
            for (int j = 0; j < array.length - i - 1; j++) {

                
                if (array[j] > array[j + 1]) {

                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}



	

