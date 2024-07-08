package KOD;

public class SwapAdjacentArray {

	public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50, 60 };

        for (int i = 0; i < array.length - 1; i += 2) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }

        // Print the array after swapping adjacent elements
        for (int element : array) {
            System.out.print(element + " ");
        }
	}
}
