package lab37SamostalniRad;

public class Person {

	private String name;
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		if (name.length() < 1)
		{
			throw new IllegalArgumentException("Name cannot be empty field!");
		}
		else
		{
			this.name = name;
		}
	}
	
}
