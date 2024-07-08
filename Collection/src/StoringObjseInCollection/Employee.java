package StoringObjseInCollection;

public class Employee {
	String name;
	int sal;
	
	Employee(String name,int sal)
	{
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString()
	{
		return "name:"+name+" sal:"+sal;
	}
	

}
