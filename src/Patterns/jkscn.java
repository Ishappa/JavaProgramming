package Patterns;

public class jkscn {
    public static void main(String[] args) {
        int i,j;
        int n=6;

        for (i=0;i<n;i++){
            int s=n-i;
            for ( j=0;j<i;j++){
                System.out.print(" ");
            }
            for (j=0;j<s;j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}
