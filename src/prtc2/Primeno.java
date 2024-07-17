package prtc2;

public class Primeno {
    public static void main(String[] args) {
        int n=10;
        int c=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    c++;
                }
            }
        }
        if (c==2){
            System.out.println("prine");
        }
    }
}
