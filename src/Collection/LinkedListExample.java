package Collection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(5);
        l.add(3);
        l.add(1);
        l.add(6);
        l.add(8);
        System.out.println(l);
        System.out.println("----------------------");

        for(Integer s:l){
            System.out.println(s);
        }
        System.out.println("----------------------");
        System.out.println(l.get(3));
        System.out.println(l.isEmpty());
        l.remove(3);
        System.out.println(l.indexOf(1));
        l.removeAll(l);
        System.out.println(l.isEmpty());



    }
}
