package fr.formation.afpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@OneToMany
	@GeneratedValue
	@Column(name= "DEPT_ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department() {
		
	}

	public int getDptId() {
		return id;
	}
	public void setDptId(int id) {
		this.id = id;
	}
	
	
}
