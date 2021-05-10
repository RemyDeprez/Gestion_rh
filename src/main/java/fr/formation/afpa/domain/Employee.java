package fr.formation.afpa.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "EMP_ID")
	private int id;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "SUPERIOR_EMP_ID")
	private int superiorId;
	@ManyToOne
	@JoinColumn(name = "DEPT_ID")
	private int dptId;
	@Column(name = "START_DATE")
	private Date startDate;

	public Employee() {

	}

	public Employee(String firstName, String lastName, String title, int superiorId, int department,
			Date startDate, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.superiorId = superiorId;
		this.dptId = department;
		this.startDate = startDate;
		this.id = id;
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

	public int getDepartmentId() {
		return dptId;
	}

	public void setDepartmentId(int dptId) {
		this.dptId = dptId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
