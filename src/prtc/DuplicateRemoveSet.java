package prtc;

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

        for (String str1:set) {
            setItems=setItems+str1;
            System.out.print(str1+" ");
        }

//        System.out.print(setItems);

        String rev="";
        for (int i=setItems.length();i>0;i--){

            System.out.print(setItems.charAt(i));
        }
    }
}
