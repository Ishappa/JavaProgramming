package Inheritance;


class Shape {
	void draw() {
		System.out.println("Drawing a shape.");
	}
}


class Circle extends Shape {
	void draw() {
		System.out.println("Drawing a circle.");
	}
}


class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing a rectangle.");
	}
}

public class HierarchicalInheritanceExample {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();

		circle.draw();    // Calls the draw() method from Circle
		rectangle.draw(); // Calls the draw() method from Rectangle
	}
}

