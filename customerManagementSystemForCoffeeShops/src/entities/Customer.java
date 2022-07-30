package entities;

import abstracts.IEntity;

public class Customer implements IEntity{
	
	private int id;
	private String firstName;
	private String lastName;
	private int birthYear;
	private String nationalityId;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstname, String lastName, int birthYear, String nationalityId) {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityID) {
		this.nationalityId = nationalityID;
	}
}
