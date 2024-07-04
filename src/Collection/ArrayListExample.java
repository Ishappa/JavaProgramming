package Collection;

import java.util.ArrayList;
public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> al=new ArrayList<String>();
        al.add("Banana");
        al.add("Mango");
        al.add("Apple");
        al.add("Orange");

        System.out.println(al);
        System.out.println("---------------------------");
        for(String s:al){
            System.out.println(s);
        }
        System.out.println("---------------------------");

        System.out.println(al.contains("Mango"));
        System.out.println(al.size());
        System.out.println(al.get(3));
        System.out.println(al.isEmpty());
        System.out.println(al.remove(0));
        System.out.println(al.indexOf("Apple"));
        System.out.println(al.addAll(new ArrayList<>(al)));

    }
}
