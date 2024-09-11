package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        Collection c = new LinkedList();
        c.add(1);
        c.add(5);
        c.add(8);
        c.add(11);

//        for(int i=0;i<c.size();i++){
//            System.out.println(c.get(i));
//        }

        for (Object n:c){
            System.out.println(n);
        }
    }
}
