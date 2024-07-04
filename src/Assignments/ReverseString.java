package Assignments;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        // String s="Hi bye hello";
//        String[] s1 = s.split(" ");
//
//        for (int i = 0; i < s1.length; i++) {
//            String s3 = s1[i];
//            String s4 = "";
//
//            for (int j = s3.length() - 1; j >= 0; j--) {
//                s4 = s4 + s3.charAt(j);
//            }
//            System.out.print(s4 + " ");
//        }
        System.out.println("Enter the String");
        String s = ip.nextLine();
        char[] a=s.toCharArray();
        int i=0;
        int j=a.length-1;
             while(i<j) {
                if(a[i]==' '){
                    i++;
                } else if (a[j]==' ') {
                    j--;
                }else {
                    char x=a[i];
                    a[i]=a[j];
                    a[j]=x;
                    i++;
                    j--;
                }
             }
             System.out.println(String.valueOf(a));
    }
}

