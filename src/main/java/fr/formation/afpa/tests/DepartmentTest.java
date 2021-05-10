package fr.formation.afpa.tests;

import fr.formation.afpa.domain.Department;
import junit.framework.TestCase;

public class DepartmentTest extends TestCase {

	public void testGetId() {
		Department dpt = new Department();
		dpt.setId(15);
		assertEquals(dpt.getId(), 15);
	}

	public void testGetDepartment() {
		Department dpt = new Department();
		dpt.setDepartment("Bio");
		assertEquals(dpt.getDepartment(), "Bio");
	}

}
