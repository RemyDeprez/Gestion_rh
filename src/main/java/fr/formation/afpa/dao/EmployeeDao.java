package fr.formation.afpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.formation.afpa.domain.Employee;

public class EmployeeDao implements IEmployeeDao {
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public EmployeeDao() {
		emf = Persistence.createEntityManagerFactory("employee");
		em = emf.createEntityManager();
	}
	
	public void beginTransaction() {
		em = emf.createEntityManager();
		em.getTransaction().begin();
				
	}
	public void commitTransaction() {		
		em.getTransaction().commit();
		em.close();		
	}
	@Override
	public Employee findById(Integer id) {
		return em.find(Employee.class, id);
	}

	@Override
	public List<Employee> findAll() {
		beginTransaction();
		return em.createQuery("select emp from Employee emp").getResultList();
	}

	@Override
	public Integer save(Employee e) {
		em.persist(e);
		return e.getEmpId();
	}

	@Override
	public Employee update(Employee e) {
		return em.merge(e);

	}

	@Override
	public void delete(Employee e) {
		
		em.remove(e);
	}

	@Override
	public void deleteById(Integer id) {
		Employee emp = findById(id);
		delete(emp);

	}


}
