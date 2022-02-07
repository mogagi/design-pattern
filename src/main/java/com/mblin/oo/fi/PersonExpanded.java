
package com.mblin.oo.fi;

public class PersonExpanded implements Comparable<PersonExpanded> {
	private String firstName;
	private String lastName;
	private String midName;

	public PersonExpanded(String firstName, String midName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.midName = midName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String middleName) {
		this.midName = middleName;
	}

	@Override
	public int compareTo(PersonExpanded otherPerson) {
		return this.lastName.compareTo(otherPerson.lastName);
	}

	@Override
	public String toString() {
		return firstName + " " + midName + " " + lastName;
	}

}
