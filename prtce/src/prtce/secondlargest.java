package prtce;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 1, 9, 8 };
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 0; i < n; i++) {
            if (largest < arr[i]   ) {
            	
                secondLargest = largest;
                largest = arr[i];
                
            } else if ( secondLargest < arr[i]  && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("The second largest number in the array is: " + secondLargest);
    }
}

