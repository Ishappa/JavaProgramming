package prtc2;

public class Person1 {

    String name;

    Person1( String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.name.equals(((Person1)obj).name)){
           return true;
        }
        return false;
    }

    String s=new String("hello");

    @Override
    public String toString() {
        return this.name;
    }
    public static void main(String[] args) {

    Person1 p1 = new Person1("ish");
    Person1 p2 = new Person1("ish");

    if (p1==p2){
        System.out.println("address");
        System.out.println(p1.equals(p2));
    }
    else if (p1.equals(p2)){
        System.out.println("obj are equals "+p1);
    }
    else {
        System.out.println("sorry bhaiyya");

    }

    }

}
