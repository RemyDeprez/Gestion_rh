package fr.formation.afpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import fr.formation.afpa.domain.Department;
import fr.formation.afpa.domain.Employee;

@Repository
public class DepartmentDao implements IDepartmentDao {
	private EntityManagerFactory emf;
	private EntityManager em;

	public DepartmentDao() {
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
	public Department findById(Integer id) {		
		return em.find(Department.class, id);
	}

	@Override
	public List<Department> findAll() {
		
		return em.createQuery("select emp from Department emp").getResultList();
	}

	@Override
	public Integer save(Department e) {
		em.persist(e);
		return e.getDeptId();
	}

	@Override
	public Department update(Department e) {
		return em.merge(e);

	}

	@Override
	public void delete(Department e) {
		
		em.remove(e);
	}

	@Override
	public void deleteById(Integer id) {
		Department dept = findById(id);
		delete(dept);

	}

}
