package Assignments;

import java.util.Scanner;

public class Anagram {

    public static String isSort(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        }
        String str=new String(arr);
        return str;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the first String");
        String s1=ip.next();
        System.out.println("Enter the Second String");
        String s2=ip.next();


        String ans1 = isSort(s1);
        String ans2= isSort(s2);
        System.out.println(ans1);
        if(ans1.equals(ans2)){
            System.out.println("It is a Anagram");
        }else{
            System.out.println("It is not a Anagram");
        }
    }

}
