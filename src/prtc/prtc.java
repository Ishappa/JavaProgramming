package prtc;

public class prtc {
    public static void main(String[] args) {
        int n=5;
//        for (int i=0;i<n*2;i++){
//            int total=i>n ? n*2-i : i;
//            int space=n-total;
//            for (int j=0;j<space;j++){
//                System.out.print(" ");
//            }
//            for (int j=0;j<total;j++){
//                System.out.print("*");
//            }
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (j==1||j==n||(i==j)&&!(j>=n/2)){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
