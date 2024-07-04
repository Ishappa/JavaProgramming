package Patterns;

public class Three {
    public static void main(String[] args) {
        int n=5;
        int row,col;
        for ( row=1;row<=2*n;row++){
//            int totalRow = row >= n ? 2*n - row : row;
            int totalRow = row >= n ? 2*n-row : row;
            for ( col=1;col<=totalRow;col++){
                System.out.print(row+" ");
            }

            System.out.println( );
        }

    }
}
