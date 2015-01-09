package lab37SamostalniRad;

public class PersonDinamicArrayList implements PersonListInterface{

	private Person[] array;
	private int nextIndex;
	
	public PersonDinamicArrayList()
	{
		array = new Person[10];
		nextIndex = 0;
	}
	
	public void add(Person person)
	{
		if (nextIndex >= array.length)
		{
			Person[] tmp = new Person[array.length*2];
			for (int i=0; i<array.length; i++)
			{
				tmp[i] = array[i];
			}
			array = tmp;
		}
		array[nextIndex] = person;
		nextIndex++;
	}

	public void printLinkedList()
	{
		for (int i=0; i<nextIndex; i++)
		{
			System.out.println(array[i].getName());
		}
	}
	
	public int count()
	{
		return nextIndex;
	}
	
	public Person[] toArray()
	{
		Person[] newArray = new Person[nextIndex];
		for (int i=0; i<nextIndex; i++)
		{
			newArray[i] = array[i];
		}
		return newArray;
	}
	
}
