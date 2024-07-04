package java8;

interface Feature {
    default void disp(){  //we can declare a default concrete methods
        System.out.println("Hello");
    }

}
@FunctionalInterface  //it should have at least one abstract method and can have any no of concrete methods
interface demo1{
    void name();

    default void disp(){
        System.out.println("Hello");
    }
    static void display(){    // we can create static concrete methods in both @FunctionalInterface and normal interface
        System.out.println("bye");
    }

}
