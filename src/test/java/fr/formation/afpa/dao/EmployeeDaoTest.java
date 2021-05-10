package fr.formation.afpa.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.formation.afpa.domain.Employee;

public class EmployeeDaoTest {
	EmployeeDao dao = new EmployeeDao();
	private static EntityManagerFactory emf;
	private static EntityManager em;

	@BeforeClass
	public static void beforeClass() {
		emf = Persistence.createEntityManagerFactory("employee");
		em = emf.createEntityManager();
	}
	@Before
	public void before() {
		em.getTransaction().begin();
	}

	@Test
	public void testFindById() {
		Employee emp =dao.findById(2);
		assertNotNull(emp);
	}
	@Test
	public void testFindAll() {
		List<Employee> list= dao.findAll();
		assertNotNull(list);
		
	}
	@Test
	public void testSave() {
		Employee emp = new Employee();
    	emp.setFirstName("bobby");
    	emp.setLastName("Remy");
    	emp.setStartDate(new Date());
    	em.persist(emp);    	
    	
    	assertNotNull(emp.getEmpId());
	}
	@Test
	public void testUpdate() {
		Employee emp = new Employee();
    	emp.setFirstName("Remy");
    	emp.setLastName("Remy");
    	emp.setStartDate(new Date());
    	em.persist(emp); 
    	Integer idInsert = emp.getEmpId();
    	emp.setFirstName("RemyTest");    	
		Employee empUpdate = em.merge(emp);
		assertNotNull(empUpdate);
		Employee efind = em.find(Employee.class, idInsert);
		assertEquals(empUpdate.getFirstName(), efind.getFirstName());
		
	}
	@Test
	public void testDelete() {
		Employee emp = new Employee();
    	emp.setFirstName("remy");
    	emp.setLastName("remy");
    	emp.setStartDate(new Date());
    	em.persist(emp); 
  	    Integer idInsert = emp.getEmpId();
 	    em.remove(emp);
 	    Employee empInsert = em.find(Employee.class, idInsert);
 	    assertNull(empInsert);
 	 
	}
	@Test
	public void testDeleteById() {
		Employee emp = new Employee();
    	emp.setFirstName("remy");
    	emp.setLastName("remy");
		Integer empId= emp.getEmpId();
		em.remove(emp);
		assertNull(emp.getEmpId());
		
	}
	@After
	public void after() {
		em.getTransaction().rollback();
	}
	@AfterClass
	public static void afterClass() {
		emf.close();
	}}