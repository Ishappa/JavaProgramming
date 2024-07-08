package Pattern;

import java.util.Scanner;

public class MPattern {
    public static void main(String[] args) {
        int n = 5;
        
        // Loop for the upper half of the M shape
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = i+1; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = i+1; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
//        // Loop for the lower half of the M shape
//        for (int i = n-1; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = i+1; j <= n; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i+1; j <= n; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//    }
    }
}