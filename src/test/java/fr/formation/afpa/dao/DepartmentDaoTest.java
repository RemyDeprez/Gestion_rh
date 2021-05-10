package fr.formation.afpa.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.formation.afpa.domain.Department;

public class DepartmentDaoTest {
	DepartmentDao dao = new DepartmentDao();
	private static EntityManagerFactory emf;
	private static EntityManager em;

	@BeforeClass
	public static void beforeClass() {
		emf = Persistence.createEntityManagerFactory("department");
		em = emf.createEntityManager();
	}
	@Before
	public void before() {
		em.getTransaction().begin();
	}

	@Test
	public void testFindById() {
		Department dept =dao.findById(2);
		assertNotNull(dept);
	}
	@Test
	public void testFindAll() {
		List<Department> list= dao.findAll();
		assertNotNull(list);
		
	}
	@Test
	public void testSave() {
		Department dept = new Department();
    	dept.setName("yo");
    	em.persist(dept);    	
    	assertNotNull(dept.getDeptId());
	}
	@Test
	public void testUpdate() {
		Department dept = new Department();
		dept.setName("yo");
    	em.persist(dept); 
    	Integer idInsert = dept.getDeptId();
    	dept.setName("yoyo");    	
    	Department deptUpdate = em.merge(dept);
		assertNotNull(deptUpdate);
		Department efind = em.find(Department.class, idInsert);
		assertEquals(deptUpdate.getName(), efind.getName());
		
	}
	@Test
	public void testDelete() {
		Department dept = new Department();
		dept.setName("yo");
    	em.persist(dept); 
    	Integer idInsert = dept.getDeptId();
 	    em.remove(dept);
 	   Department deptInsert = em.find(Department.class, idInsert);
 	    assertNull(deptInsert);
 	 
	}
	@Test
	public void testDeleteById() {
		Department dept = new Department();
		dept.setName("Pierrot");
		Integer deptId= dept.getDeptId();
		em.remove(dept);
		assertNull(dept.getDeptId());
		
	}
	
	@After
	public void after() {
		em.getTransaction().rollback();
	}
	@AfterClass
	public static void afterClass() {
		emf.close();
	}}

