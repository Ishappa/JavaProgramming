package Inheritance;


interface Swimming {
	void swim();
}


interface Flying {
	void fly();
}


class Bird implements Swimming, Flying {
	@Override
	public void swim() {
		System.out.println("Bird can swim.");
	}

	@Override
	public void fly() {
		System.out.println("Bird can fly.");
	}
}

public class MultipleInheritanceExample {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.swim(); // Calls the swim() method from Swimming interface
		bird.fly();  // Calls the fly() method from Flying interface
	}
}

