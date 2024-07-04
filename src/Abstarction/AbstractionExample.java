package Abstarction;


abstract class Shape {
	public abstract void draw();
	public void display() {
		System.out.println("This is a shape..");
	}
}
class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a circle..");
	}
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle....");
	}
}

public class AbstractionExample {
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();

		circle.display();    // Calls the Shape's display() method
		circle.draw();       // Calls the Circle's draw() method

		rectangle.display(); // Calls the Shape's display() method
		rectangle.draw();    // Calls the Rectangle's draw() method
	}
}

