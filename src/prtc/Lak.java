package prtc;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lak {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4);
        Map<Integer, Integer> newMap = list.stream().collect(Collectors.toMap(index -> index, value -> value));
        System.out.println(newMap);
    }
}