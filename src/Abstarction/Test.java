package Abstarction;

public class Test {
    public static void main(String[] args) {
        int n=7;
        int i,j;

        for(i=1;i<=n;i++){
            int space=n-i;
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
