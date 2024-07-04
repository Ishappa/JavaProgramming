package Assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set {
    public static void main(String[] args) {
       HashSet<String> s=new HashSet<String>();
       s.add("ish");
       s.add("manoj");
       s.add("puni");
       s.add("ish");

        for (String s1:s) {
            System.out.println(s1);
        }

        System.out.println("---------------------------------");
        LinkedHashSet<String> s2=new LinkedHashSet<String>();
        s2.add("ish");
        s2.add("juna");
        s2.add("akshay");
        s2.add("ish");

        for (String s3:s2) {
            System.out.println(s3);
        }




    }
}
