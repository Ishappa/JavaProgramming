package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        String[] s = {"nagi","isha","kudari","nagi"};
//        Set<String> unique = new HashSet<String>();  //--> Hashset will not maintain the insertion order o/p:[isha, nagi, kudari]
        Set<String> unique = new LinkedHashSet<>();     //-->LinkedHashset will maintain the insertion order o/p:[nagi,isha, kudari]
        for (int i = 0; i < s.length; i++) {
            unique.add(s[i]);
        }
        System.out.println(unique);
    }
}
