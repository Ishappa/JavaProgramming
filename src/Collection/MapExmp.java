package Collection;

import Assignments.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExmp {

    public static void main(String[] args) {
        Map m=new HashMap();
        m.put(1,"AEM");
        m.put(null, "HTML");
        m.put("JS",23.1);
        m.put(2.1,555);

        System.out.println(m);
        System.out.println("=======================");

        System.out.println(m.size());
        System.out.println(m.get(1));
        System.out.println(m.containsKey(2.1));
        System.out.println(m.containsValue("sql"));

        System.out.println("=======================");
        System.out.println(m);
        m.remove(1);
        System.out.println(m);
        System.out.println(m.isEmpty());
        m.clear();
        System.out.println(m.isEmpty());

        System.out.println("======Tree Map=========");
        Map m1=new TreeMap();
        m1.put(2,"ish");
        m1.put(4,"dan");
        m1.put(1,"Aksh");
        m1.put(5,"Deeks");
        System.out.println(m1);





    }
}
