package Patterns;

class HelloWorld {
    public static void main(String[] args) {
        int n=6;

        for(int i=0;i<n*2;i++){
            int total=i>n? n*2-i : i;
            int space=n-total;
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }
            for(int j=0;j<total;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}