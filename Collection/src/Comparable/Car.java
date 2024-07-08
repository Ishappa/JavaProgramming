package Comparable;//Default Sorting

public class Car implements Comparable<Car> 
{
	int cost;
	
	Car(int cost)
	{
		this.cost=cost;
	}
	
	@Override
	public String toString()
	{
		return "cost is:"+cost;
	}
	
	@Override
	public int compareTo(Car c)
	{
		return this.cost-c.cost;//c.cost-this.cost-->for descending
	}
	
	//this-->Object to be Inserted
	//c-->Already Existing Object
}
