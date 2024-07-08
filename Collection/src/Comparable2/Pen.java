package Comparable2;

public class Pen implements Comparable<Pen>
{
	int cost;
	
	Pen(int cost)
	{
		this.cost=cost;
	}
	@Override
	public String toString()
	{
		return "cost:"+cost;
	}
	@Override
	public int compareTo(Pen p)
	{
		return this.cost-p.cost;
	}
}
  