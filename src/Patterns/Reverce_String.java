package Patterns;

public class Reverce_String {

    public static void main(String[] args) {

        String s="Hello hi";
        String [] s1=s.split(" ");
        for (int i=0;i< s1.length;i++){
            String s2=s1[i];
            String s3="";

            for (int j=s2.length()-1;j>=0;j--){
                s3=s3+s2.charAt(j);

            }
            System.out.print(s3+" ");
        }


    }
}
