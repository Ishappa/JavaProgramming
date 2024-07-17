package java8.ptrc;

import java.util.TreeSet;

public class ExampleCompratr {
    int age;
    String name;

    ExampleCompratr(int age, String name) {
        this.age = age;
        this.name=name;
    }

    @Override
    public String toString() {

        return "Name: " + name + " Age: " + age;
    }

    public static void main(String[] args) {
        ExampleCompratr e1 = new ExampleCompratr(6,"nagi");
        ExampleCompratr e2 = new ExampleCompratr(25,"swaroop");
        ExampleCompratr e3 = new ExampleCompratr(31,"Thiru");


        TreeSet<ExampleCompratr> t = new TreeSet<ExampleCompratr>();
        t.add(e1);
        t.add(e2);
        t.add(e3);

        for(ExampleCompratr data:t){
            System.out.println(data);
        }
        
    }


}