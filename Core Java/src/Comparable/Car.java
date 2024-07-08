package Comparable;

import java.util.TreeSet;

public class Car implements Comparable<Car> {

	int cost;
	
	Car(int cost){
		this.cost=cost;
	}
	
	public String toString() {
		return "Cost of car is : "+cost;
	}
	
	public int compareTo(Car c) {
		return this.cost-c.cost;
		
	}
	public static void main(String[] args) {
		Car c= new Car(2000);
		Car c1= new Car(8000);
		Car c2= new Car(5000);
		
		
		TreeSet<Car> t= new TreeSet<Car>();
		t.add(c);
		t.add(c1);
		t.add(c2);
		
		for(Car C:t) {
			
			System.out.println(C);
		}
		
	}
	
}
