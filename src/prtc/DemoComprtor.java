package prtc;

import java.util.TreeSet;

public class DemoComprtor {

    int age;
    String name;

   public DemoComprtor(int age, String name){
       this.age=age;
       this.name=name;
   }

   @Override
   public String toString(){
       return "name: "+name+" age: "+age;
   }


    public static void main(String[] args) {
        DemoComprtor d1 = new DemoComprtor(25,"CNaveen");
        DemoComprtor d2 = new DemoComprtor(23,"Akshy");
        DemoComprtor d3 = new DemoComprtor(28,"Nags");
        DemoComprtor d4 = new DemoComprtor(32,"Sankar");


//        SortByAgeComprter s= new SortByAgeComprter();

        TreeSet<DemoComprtor> t= new TreeSet<>(new SortByNameComprter());
        t.add(d1);
        t.add(d2);
        t.add(d3);
        t.add(d4);

        System.out.println(t);
        for (DemoComprtor d:t) {
//            System.out.println(d.age+":"+d.name);
            System.out.println(d);
        }


    }
}
