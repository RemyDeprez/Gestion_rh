package fr.formation.afpa.dao;

import fr.formation.afpa.domain.Department;
import junit.framework.TestCase;

public class DepartmentTest extends TestCase {


	public void testGetDepartment() {
		Department dpt = new Department();
		dpt.setDptId(2);
		assertEquals(dpt.getName(), "Loans");
	}

}
