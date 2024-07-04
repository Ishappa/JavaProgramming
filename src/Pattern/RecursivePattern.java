package Pattern;

public class RecursivePattern {

    public static void main(String[] args) {
        int n = 6;
        printPattern(n, 1, 1);
    }

    public static void printPattern(int n, int i, int j) {
        if (i > n) {
            return; // Base case: Stop recursion when i exceeds n
        }

        if ((j == 3 && i == 1) || (j == 2 && i == 1)) {
            System.out.print(" ");
        } else if (j == 1 || (i == 3 && i >= j) || j == 3) {
            System.out.print("*");
        } else if (j == 2) {
            System.out.print(" ");
        }

        // Move to the next column
        if (j < n) {
            printPattern(n, i, j + 1);
        } else {
            // Move to the next row
            System.out.println();
            printPattern(n, i + 1, 1);
        }
    }
}
