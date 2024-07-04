package prtc;

import java.util.Comparator;

public class SortByNameComprter implements Comparator<DemoComprtor> {

    @Override
    public int compare(DemoComprtor d1, DemoComprtor d2) {
        return d1.name.compareTo(d2.name);
    }
}
