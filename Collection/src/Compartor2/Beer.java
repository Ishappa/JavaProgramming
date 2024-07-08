package Compartor2;

public class Beer 
{
	int cost;
	String brand;
	
	
	public Beer(int cost,String brand)
	{
		this.cost=cost;
		this.brand=brand;
		
	}
	
	public String toString()
	{
		return brand+":cost is "+cost;
	}

}
