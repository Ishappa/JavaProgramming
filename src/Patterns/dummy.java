package Patterns;

public class dummy {
    public static void main(String[] args) {
        int n=5;
        int i,j;

        for ( i=1;i<=n;i++){
            for ( j=1;j<=n;j++){
                if (i<=j){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
