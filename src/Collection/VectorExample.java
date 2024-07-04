package Collection;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Double> v=new Vector<Double>();
        v.add(20.21);
        v.add(35.01);
        v.add(54.11);
        v.add(12.54);
        v.add(44.11);

        System.out.println(v);
        System.out.println("--------------------");
        for(Double d:v){
            System.out.println(d);

        }
        System.out.println("--------------------");
        System.out.println(v.contains(22.21));
        System.out.println(v.size());
        System.out.println(v.get(3));




    }
}
