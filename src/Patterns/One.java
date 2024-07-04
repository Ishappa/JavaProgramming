package Patterns;

public class One {
    public static void main(String[] args) {
        int n=5;
        int row,col;

        for (row=1;row<=n;row++){
            for (col=1;col<=row;col++){
                System.out.print(row);
            }
            System.out.println( );
        }


    }
}
