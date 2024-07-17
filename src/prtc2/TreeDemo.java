package prtc2;

import java.util.TreeSet;

public class TreeDemo {
    public static void main(String[] args) {
        TreeSet<String> t=new TreeSet<String>();
        t.add("hek");
        t.add("bye");
        t.add("hello");


        System.out.println(t);

        Object obj=new Object();
        System.out.println(obj);

        TreeDemo td=new TreeDemo();
        System.out.println(t.hashCode());

    }


}
