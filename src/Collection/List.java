package Collection;

import java.util.LinkedHashSet;


public class List {

    public static void main(String[] args) {

        LinkedHashSet<Integer> a= new LinkedHashSet();
        a.add(10);
        a.add(30);
        a.add(10);
        a.add(52);

       for(Integer i:a){
           System.out.println(i);
       }



    }
}
