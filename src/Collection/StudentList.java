package Collection;


import java.util.TreeMap;
import java.util.TreeSet;

public class StudentList implements Comparable<StudentList> {

    int age;
    String name;

   
    public StudentList(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    @Override
    public int compareTo(StudentList s){
        return this.age-s.age;
    }

   @Override
   public String toString(){
       return "Age is : "+age+" Name is : "+name;
   }



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
