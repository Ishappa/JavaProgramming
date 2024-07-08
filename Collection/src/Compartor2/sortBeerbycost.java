package Compartor2;
import java.util.Comparator;

public class sortBeerbycost implements Comparator<Beer>  
{
	@Override
	public int compare(Beer x,Beer y) 
	{
		return x.cost-y.cost;
	}
}
