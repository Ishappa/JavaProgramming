package prtc;

public class pattern2 {
    public static void main(String[] args) {
        int n=6;
        int i, j;

        for ( i=1;i<=n;i++){
            for (j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print(i);
//                System.out.print(j);
            }
            System.out.println( );
        }

    }
}
