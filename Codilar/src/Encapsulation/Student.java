package Encapsulation;

public class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age=age;
	}

	// Getter method for name
	public String getName() {
		return name;
	}

	// Setter method for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for age
	public int getAge() {
		return age;
	}

	// Setter method for age with validation
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			System.out.println("Age cannot be negative.");
		}
	}

	public static void main(String[] args) {
		Student s = new Student("John", 20);

		// Accessing properties using getters and setters
		System.out.println("Student Name: " + s.getName());
		System.out.println("Student Age: " + s.getAge());

		s.setAge(-5);  

		s.setAge(22);

		// Accessing the modified age
		System.out.println("Modified Student Age: " + s.getAge());
	}
}

