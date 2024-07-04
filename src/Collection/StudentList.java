package Collection;

import lombok.Data;
import lombok.ToString;

import java.util.TreeMap;
import java.util.TreeSet;

//@ToString
@Data
public class StudentList implements Comparable<StudentList> {

    int age;
    String name;

    StudentList(int age, String name){
        this.age=age;
        this.name=name;
    }
    @Override
    public int compareTo(StudentList s){
        return this.age-s.age;
    }
//
//    @Override
//    public String toString(){
//        return "Age is : "+age+" Name is : "+name;
//    }



    public static void main(String[] args) {

         StudentList s1=new StudentList(22,"Isha");
         StudentList s2=new StudentList(24,"Akshay");
         StudentList s3=new StudentList(20,"Deekshi");
         StudentList s4=new StudentList(23,"Naveen");


         TreeSet<StudentList> t=new TreeSet<StudentList>();
         t.add(s1);
         t.add(s2);
         t.add(s3);
         t.add(s4);

         for(StudentList s:t)
             System.out.println(s);

    }

}
