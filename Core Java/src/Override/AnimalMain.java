package Override;

public class AnimalMain {

	public static void main(String[] args) {
		Animal a= new Animal();
		a.sound();
		int add1 =a.add(2, 2);
		
		Dog a1 = new Dog();
		a1.sound();
		int add2=a1.add(2, 2);
		
		System.out.println(add1);
		System.out.println(add2);
	}
}
