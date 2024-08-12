package Logical.basic;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemoveSet {
    public static void main(String[] args) {
        String setItems="";
        String[] s = {"Hello","Hi","Welcome","Hi"};

        Set<String> set=new HashSet<>();

        for (String str:s) {
            set.add(str);
        }
        System.out.println(set);

        for(int i=s.length-1; i>=0; i--) {

            System.out.print(s[i]+" ");
    }
}
}