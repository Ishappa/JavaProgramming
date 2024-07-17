package java8.ptrc;

import java.util.*;

public class ExamplXomparable implements Comparable<ExamplXomparable>{

    int age;
    String name;

    ExamplXomparable(int age, String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public int compareTo(ExamplXomparable other){
        return this.age - other.age;
    }

    @Override
    public String toString(){
        return "Name:" + name+" age:" + age;
    }

    public static void main(String[] args) {
        ExamplXomparable e1 = new ExamplXomparable(6,"nagi");
        e1.age =21;
        ExamplXomparable e2 = new ExamplXomparable(25,"swaroop");
        ExamplXomparable e3 = new ExamplXomparable(31,"Thiru");


        TreeSet<ExamplXomparable> t = new TreeSet<ExamplXomparable>();
        t.add(e1);
        t.add(e2);
        t.add(e3);

        for(ExamplXomparable data:t){
            System.out.println(data);
        }
        
    }
}
