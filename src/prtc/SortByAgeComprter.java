package prtc;

import java.util.Comparator;

public class SortByAgeComprter implements Comparator<DemoComprtor> {
    @Override
    public int compare(DemoComprtor s1, DemoComprtor s2) {
        return s1.age-s2.age;
    }


}
