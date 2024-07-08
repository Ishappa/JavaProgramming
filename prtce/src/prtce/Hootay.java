package prtce;

public class Hootay 
{
	protected void doo()  
	{
		System.out.println("oooooooooooo");
		
		}

	public static void main(String[] args)  {
		Hootay hootay=new Hootay();
		hootay.doo();
		try
		{
			throw new EeshwarException("jjjhjkhbxjh");
			
		}catch (Exception e) {
			String s=e.getMessage();
			System.out.println(s);
		}
		System.out.println("oooooooooooo");
		
	}
}
