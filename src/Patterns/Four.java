package Patterns;

public class Four {
    public static void main(String[] args) {
        int n=6;
        int row,col;
        for (row=0;row<n;row++){

//            int space=n-row;
//            for (int s=1;s<=space;s++){
//                System.out.print(" ");
//            }
            for ( col=n-row;col>1;col--){
                System.out.print(" ");
            }
            for (col=0;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
