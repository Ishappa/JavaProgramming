package Polymorphism;

public class AnimalMain {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		Animal a1 = new Dog();
		a1.sound();
	}
}
