package lab37SamostalniRad;

public class PersonNode {

	private Person person;
	private PersonNode next;
	
	public PersonNode(Person person)
	{	
		this.person = person;
		this.next = null;
		
	}
	
	public PersonNode(Person person, PersonNode next)
	{	
		this.person = person;
		this.next = next;
		
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public PersonNode getNext() {
		return next;
	}

	public void setNext(PersonNode next) {
		this.next = next;
	}
	
}
