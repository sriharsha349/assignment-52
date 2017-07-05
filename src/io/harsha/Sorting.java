package io.harsha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {
	
	public static void main(String[] args){
		ArrayList<Person> Persons = new ArrayList<Person>();
		Persons.add(new Person("Harsha", "Gadamsetty", "25", "5000") );
		Persons.add(new Person("vijay", "Vankadaru", "26", "6000") );
		Persons.add(new Person("keshav", "yeduru", "35", "7000") );
		
		ArrayList<Person> persons2 = (ArrayList<Person>) Persons.clone();
		
		
		Comparator<Person> c1 = new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.lastName.compareTo(p2.lastName);
			}
		};
		Collections.sort(Persons, c1);
		System.out.println(Persons);
		
		
		System.out.println("basing on last name");
		Comparator<Person> c2 = (Person p1, Person p2) -> p1.lastName.compareTo(p2.lastName);
		Collections.sort(persons2, c2);
		System.out.println(persons2);
		System.out.println("based on last name");
		Comparator<Person> c3 = (Person p1, Person p2) -> p1.firstName.compareTo(p2.firstName);
		Collections.sort(persons2, c3);
		System.out.println(persons2);
		System.out.println("based on age");
		Comparator<Person> c4 = (Person p1, Person p2) -> p1.age.compareTo(p2.age);
		Collections.sort(persons2, c4);
		System.out.println(persons2);
		System.out.println("based on age");
		Comparator<Person> c5 = (Person p1, Person p2) -> p1.salary.compareTo(p2.salary);
		Collections.sort(persons2, c5);
		System.out.println(persons2);
       
	}
}


