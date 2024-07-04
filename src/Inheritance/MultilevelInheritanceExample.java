package Inheritance;


class Grandparent {
	void talk() {
		System.out.println("Grandparent is talking...");
	}
}

class Parent extends Grandparent {
	void walk() {
		System.out.println("Parent is walking...");
	}
}

class Child extends Parent {
	void play() {
		System.out.println("Child is playing....");
	}
}

public class MultilevelInheritanceExample {
	public static void main(String[] args) {
		Child child = new Child();
		child.talk(); // Calls the talk() method from Grandparent
		child.walk(); // Calls the walk() method from Parent
		child.play(); // Calls the play() method from Child
	}
}

