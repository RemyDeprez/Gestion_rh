package fr.formation.afpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.formation.afpa.domain.Employee;

public class EmployeeDao implements IEmployeeDao {
	private Class<Employee> entityClass;
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionrh");
	EntityManager em = emf.createEntityManager();
	Employee emp = new Employee();
	private EntityTransaction currentTransaction;

	
	public void closeCurrentSession() {
		em.close();
	}
	public EntityManager getCurrentSession() {
		return em;
	}
	public static EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}
	public EntityTransaction openCurrentSessionWithTx() {
		em = getEntityManagerFactory().createEntityManager();
		currentTransaction = em.getTransaction();
		return currentTransaction;
	}
	
	public void closeCurrentSessionWithTx() {
		currentTransaction.commit();
		em.close();
	}
	
	public EntityManager openCurrentSession() {
		em = getEntityManagerFactory().createEntityManager();
		return em;
	}
	
	
	public EntityTransaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(EntityTransaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

	public void setCurrentSession(EntityManager currentSession) {
		this.em = currentSession;
	}

	
	@Override
	public Employee findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Integer save(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Employee update(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void delete(Employee e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}


}
