package fr.formation.afpa.dao;

import fr.formation.afpa.dao.EmployeeDao;
import fr.formation.afpa.domain.Employee;
import junit.framework.TestCase;

public class EmployeeDaoTest extends TestCase {
	EmployeeDao dao = new EmployeeDao();

	public void testFindById() {
		Employee emp = new Employee();
		emp.setId(5959);
		emp.setFirstName("bobby");
		assertEquals(dao.findById(5959), Employee.class);
	}

	public void testFindAll() {
		fail("Not yet implemented");
	}

	public void testSave() {
		fail("Not yet implemented");
	}

	public void testUpdate() {
		fail("Not yet implemented");
	}

	public void testDelete() {
		fail("Not yet implemented");
	}

	public void testDeleteById() {
		fail("Not yet implemented");
	}

}
