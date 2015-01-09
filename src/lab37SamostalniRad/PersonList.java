package lab37SamostalniRad;

public class PersonList {

	private static PersonNode firstPerson;
	
	public PersonNode getFirstPerson()
	{
		return firstPerson;
	}
	
	public void add(Person person)
	{
		PersonNode next = new PersonNode(person);
		if(firstPerson == null)
		{
			firstPerson = next;
		}
		else
		{
			PersonNode lastPerson = firstPerson;
			while(lastPerson.getNext() != null)
			{
				lastPerson = lastPerson.getNext();
			}
			lastPerson.setNext(next);
		}
		
	}
	
	public static int count()
	{
		int counter = 0;
		for(PersonNode current = firstPerson; current != null; current = current.getNext())
		{
			counter++;
		}
		counter--;
		return counter;
	}
	
	public static Person[] toArray()
	{
		Person[] array = new Person[count()+1];
		int i = 0;
		for(PersonNode current = firstPerson; current != null; current = current.getNext())
		{
			array[i] = current.getPerson();
			i++;
		}
		
		return array;
	}
	
	public static void printLinkedList()
	{
		for (PersonNode current = firstPerson; current != null; current = current.getNext())
		{
			System.out.println(current.getPerson().getName());
		}
	}
	
}
