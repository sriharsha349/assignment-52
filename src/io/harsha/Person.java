package io.harsha;

public class Person {
	public String firstName;
	public String lastName;
	public String age;
	public String salary;
	
	public Person(String firstName, String lastName, String age, String salary){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		
	}
	
	public String toString() {
		return lastName + ", " + firstName;
	}
}
