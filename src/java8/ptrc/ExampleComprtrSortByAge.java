package java8.ptrc;

import java.util.Comparator;

 public class ExampleComprtrSortByAge implements Comparator<ExampleCompratr>{

    @Override
    public int compare(ExampleCompratr a, ExampleCompratr b) {
        return a.age-b.age;
    }

}
