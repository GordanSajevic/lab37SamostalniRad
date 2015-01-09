package lab37SamostalniRad;

import java.util.Scanner;

public class PersonEntry {
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		String name;
		PersonDinamicArrayList list = new PersonDinamicArrayList();
		do
		{
			System.out.println("Enter name: ");
			name = unos.nextLine();
			Person person = new Person(name);
			list.add(person);
			
		}while(!name.equals(""));
		list.printLinkedList();
		System.out.println(list.count());
		Person[] array = list.toArray();
		System.out.println();
		for (int i=0; i<list.count(); i++)
		{
			System.out.println(array[i].getName());
		}
		unos.close();
	}

}
