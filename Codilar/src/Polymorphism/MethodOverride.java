package Polymorphism;


//===========Example RunTime polymorphism=========== 
class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("Cat Making sound");
	}
}

public class MethodOverride {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();

		animal.makeSound(); // Calls the Animal's makeSound() method
		dog.makeSound();    // Calls the overridden Dog's makeSound() method
		cat.makeSound();
	}
}

