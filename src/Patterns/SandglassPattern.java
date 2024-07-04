package Patterns;

public class SandglassPattern {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n * 2; i++) {
            int totalRows = i > n ? n * 2 - i : i;
            int space = n - totalRows;

            // Add extra space for the upper half of the sandglass
            if (i < n) {
                space += n - totalRows;
            }

            // Print spaces
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int j = 0; j < totalRows; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}



