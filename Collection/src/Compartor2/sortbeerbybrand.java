package Compartor2;
import java.util.Comparator;
public class sortbeerbybrand implements Comparator<Beer>
{
	@Override
	public int compare(Beer x,Beer y)
	{
		return x.brand.compareTo(y.brand);
	}
}

 