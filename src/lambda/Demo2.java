package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {

//     create a Stream Obj
        Stream<Integer> stream;

//     map(): Applies a function to each element in the stream and returns a new stream with the results.
       List<Integer> numbers = Arrays.asList(2,3,5,8);
       List<Integer> sqr = numbers.stream()
               .map(m->m*m)
               .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(sqr);
        System.out.println("====================");

//      filter(): Selects elements based on a given predicate.
        List<String> values = Arrays.asList("Hello","welcome","bye");
        List<String> filterNames = values.stream()
                .filter(s -> s.endsWith("e"))
                .collect(Collectors.toList());
        System.out.println(values);
        System.out.println(filterNames);
        System.out.println("====================");

//        sorted(): Sorts the stream.
        List<String> names = Arrays.asList("Akshay","kudai","Ish","Naveen");
        List<String> sortNames = names.stream()
                .sorted()
//              .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(names);
        System.out.println(sortNames);
        System.out.println("============================");
    }
}
