package Patterns;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        String s="Hello";
        char[] s1=s.toCharArray();

//        char[] s2=s.toCharArray();
//
//        for (int i=0;i<s1.length;i++){
//            int c=0;
//            for (int j=0;j<s2.length;j++){
//                if (s1[i]==s2[j]){
//                    c++;
//                    s2[j]='0';
//                }
//            }
//            if(c>1){
//                System.out.print(s1[i]);
//            }
//        }

        Set<Character> s3=new HashSet<>();
         for (char c:s1) {
             if(s3.add(c)){

             }else {
                 System.out.println(c);
             }

             s=s+c;

        }

        System.out.println(s3);

//        for (char n:s3) {
//            System.out.println(n);
//        }

    }
}
