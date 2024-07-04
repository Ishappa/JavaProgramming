package prtc;

import java.util.TreeSet;

public class DemoComprble implements Comparable<DemoComprble> {

    int age;
    String name;

 DemoComprble(int age, String name){
        this.age=age;
        this.name=name;
    }



    @Override
    public int compareTo(DemoComprble d) {
        return this.age-d.age;
    }

    @Override
    public String toString(){
        return "name: "+name+ "age: "+age;
    }

    public static void main(String[] args) {

        DemoComprble d1 = new DemoComprble(25,"Naveen");
        DemoComprble d2 = new DemoComprble(23,"Akshy");
        DemoComprble d3 = new DemoComprble(28,"Nags");
        DemoComprble d4 = new DemoComprble(32,"Sankar");

        TreeSet<DemoComprble> t = new TreeSet<>();
        t.add(d1);
        t.add(d2);
        t.add(d3);
        t.add(d4);

        for (DemoComprble demo:t) {
            System.out.println(demo);
        }


    }
}
