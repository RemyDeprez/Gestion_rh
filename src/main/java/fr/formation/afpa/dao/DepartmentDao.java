package fr.formation.afpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.formation.afpa.domain.Department;

public class DepartmentDao implements IDepartmentDao {
	private Class<Department> entityClass;
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionrh");
	EntityManager em = emf.createEntityManager();
	EntityTransaction currentTransaction;

	
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
	public Department findById(Integer id) {
		return getCurrentSession().find(entityClass, id);
	}
	@Override
	public List<Department> findAll() {
		getCurrentSession().createQuery("select t from "+entityClass.getSimpleName()+" t");
		return null;
	}
	@Override
	public Integer save(Department dpt) {
		getCurrentSession().persist(dpt);
		getCurrentSession().flush();
		return null;
	}
	@Override
	public Department update(Department dpt) {
		getCurrentSession().refresh(dpt);
		getCurrentSession().flush();
		return null;
	}
	@Override
	public void delete(Department dpt) {
		getCurrentSession().clear();
		getCurrentSession().flush();
		
	}
	@Override
	public void deleteById(Integer id) {
		getCurrentSession().find(entityClass, id);
		getCurrentSession().flush();
		
	}

}
