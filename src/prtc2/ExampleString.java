package prtc2;

public class ExampleString {
    public static void main(String[] args) {

        //constant pool and duplicate not allow
        //if we pass same value in both string obj only one obj get create s2 ref will start pointing
        String s1="hello";
        //s1=s1+"welcome"; //false
        String s2="hello";

        System.out.println(s1==s2);//checking reference address
        System.out.println("=================================");

        //non-constant pool and duplicate will allow
        //if we pass same value in both string obj then two obj get create str1 and str2
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1==str2);
        System.out.println("=================================");







    }
}
