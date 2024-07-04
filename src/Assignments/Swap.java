package Assignments;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner ip=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=ip.nextInt();
        System.out.println("Enter b value");
        int b=ip.nextInt();


        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a value will become: "+a+" \nb value will become "+b);
    }
}



//        1) Swap two numbers without using a third variable in Java
//        2) Valid Username Regular Expression
//        3) Removing repeated elements from an array and finding out the second-largest value
//        4) Reverse the string, preserving the position of spaces
//        5)Find Longest Substring Without Repeating Characters In Java