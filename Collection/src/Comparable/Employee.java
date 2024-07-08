package Comparable;

public class Employee implements Comparable<Employee> {
	Double salary;
	String name;
	
	Employee(double salary,String name)
	{
		this.salary=salary; 
		this.name=name;
	}
	@Override
	public String toString()
	{
		return "Salary:"+salary+"\tName:"+name;
	}
	
	@Override
	public int compareTo(Employee e)
	{
		return this.name.compareTo(e.name);
	}
}
