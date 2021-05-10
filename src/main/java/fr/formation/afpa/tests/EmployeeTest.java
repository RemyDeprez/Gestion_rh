package fr.formation.afpa.tests;

import fr.formation.afpa.domain.Employee;
import junit.framework.TestCase;

public class EmployeeTest extends TestCase {



	public void testGetFirstName() {
		Employee emp = new Employee();
		emp.setFirstName("bobby");
		assertEquals(emp.getFirstName(), "bobby");
		
	}
	
	public void testGetLastName() {
		Employee emp = new Employee();
		emp.setLastName("bobby");
		assertEquals(emp.getLastName(), "bobby");
	}


	public void testGetTitle() {
		Employee emp = new Employee();
		emp.setTitle("bobby");
		assertEquals(emp.getTitle(), "bobby");
	}


	public void testGetSuperiorId() {
		Employee emp = new Employee();
		emp.setSuperiorId(2);
		assertEquals(emp.getSuperiorId(), 2);
	}


	public void testGetDepartment() {
		Employee emp = new Employee();
		emp.setDepartment(2);
		assertEquals(emp.getDepartment(), 2);
	}

	

	public void testGetStartDate() {
		Employee emp = new Employee();
		emp.setLastName("bobby");
		assertEquals(emp.getLastName(), "bobby");
	}


}
