package StringEX;

public class Demo1 {
    public static void main(String[] args) {

        String name = "isha";// this one will go to garbage collection
        name = name+" K"; // new object get created 
        System.out.println(name);

        String a = "hi";
        String b = "hi";

        System.out.println(a == b); // true as both are pointing to same object in memory.
        // here it will not create a new object
        //string obj will store string constant pool

    }

}
