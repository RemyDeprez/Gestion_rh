package fr.formation.afpa.dao;

import java.util.List;

import fr.formation.afpa.dao.EmployeeDao;
import fr.formation.afpa.domain.Employee;
import junit.framework.TestCase;

public class EmployeeDaoTest extends TestCase {
	EmployeeDao dao = new EmployeeDao();

	public void testFindById() {
		Employee emp =dao.findById(2);
		assertNotNull(emp);

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
