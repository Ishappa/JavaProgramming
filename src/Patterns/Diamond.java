package Patterns;

public class Diamond {
    public static void main(String[] args) {
        int n=4;
        int i,j;
        for (i=0;i<n*2;i++){//-->1st

            int totalRows = i>n ? n*2-i:i;//2nd

            int space=n-totalRows;//3rd
            for (int s=0;s<space;s++){
                System.out.print(" ");
            }

            for (j=0;j<totalRows;j++){//4th
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

