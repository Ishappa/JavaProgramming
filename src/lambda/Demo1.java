package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo1 {




//    public static boolean testNumber(int num){
//        return  num>0?true:false;
//    }
//    Predicate<Integer> predicate=Demo1::testNumber;
Predicate<Integer> predicate=(Integer num)->{
        return  num > 0 ? true : false;
};

Consumer<String> consumer=(String str)->{

    str=str.toUpperCase();
    System.out.println(str);
};

Function<String,Boolean> function=(String str)->{
    return str.contains("@");
};


public void printElement(int ele){
    System.out.println(ele);
}

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(8);
        a.add(12);
        a.add(6);

        Stream<Integer> sortedElement=a.stream().sorted((ele1, ele2)->{
            return  ele2.compareTo(ele1);
        });

        sortedElement.forEach(ele-> System.out.println(ele));


        Demo1 demo1=new Demo1();
        System.out.println(demo1.predicate.test(2));
//        a.forEach(element-> System.out.println(element));
        demo1.consumer.accept("hello");
        System.out.println(demo1.function.apply("s@s"));
        a.forEach(demo1::printElement);

        Map<String,Integer> map=new HashMap();
        map.put("One",1);

        map.entrySet().stream().forEach((streamMap)->{
            System.out.println(streamMap.getKey());
        });


    }




}
