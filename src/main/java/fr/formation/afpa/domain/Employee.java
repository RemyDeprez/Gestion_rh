package fr.formation.afpa.domain;

public class Employee {
	public String firstName;
	public String lastName;
	public String title;
	public int superiorId;
	public int department;
	public int startDate;
	
	
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getSuperiorId() {
		return superiorId;
	}
	public void setSuperiorId(int superiorId) {
		this.superiorId = superiorId;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public int getStartDate() {
		return startDate;
	}
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}
	
}
