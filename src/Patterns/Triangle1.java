package Patterns;

public class Triangle1 {
    public static void main(String[] args) {
        int n=6;
        int i,j;

        for (i=0;i<n;i++){
    //adding spaces
            int spaces=n-i;//n-rows
            for (j=0;j<spaces;j++){
                System.out.print(" ");
            }

            for (j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
