package fr.formation.afpa.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.formation.afpa.domain.Employee;

public class EmployeeDao implements IEmployeeDao {
	private Class<Employee> entityClass;
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionrh");
	EntityManager em = emf.createEntityManager();
	Employee emp = new Employee();

	
	public void closeCurrentSession() {
		em.close();
	}
	public EntityManager getCurrentSession() {
		return em;
	}
	private static EntityManagerFactory getEntityManagerFactory() {
		return emf;
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
