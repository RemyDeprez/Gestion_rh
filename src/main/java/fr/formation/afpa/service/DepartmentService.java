package fr.formation.afpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.afpa.dao.IDepartmentDao;
import fr.formation.afpa.domain.Department;
@Service
@Transactional
public class DepartmentService implements IDepartmentService {
	
	@Autowired
	private IDepartmentDao dao ;
	
	public IDepartmentDao getDao() {
		return dao;
	}
	
	public Department findById(Integer id) {	
		dao.beginTransaction();
		Department dept = dao.findById(id);
		dao.commitTransaction();
		return dept;
	}

	public List<Department> findAll() {
		dao.beginTransaction();
		List<Department> list = dao.findAll();
		dao.commitTransaction();
		return list;
	}

	public Department save(Department e) {
		dao.beginTransaction();
		dao.save(e);
		dao.commitTransaction();
		return e;
	}

	public Department update(Department e) {
		dao.beginTransaction();
		dao.update(e);
		dao.commitTransaction();
		return e;

	}

	public void delete(Department e) {
		dao.beginTransaction();
		dao.delete(e);
		dao.commitTransaction();
	}

	
	public void deleteById(Integer id) {
		dao.beginTransaction();
		Department dept = findById(id);
		dao.delete(dept);
		dao.commitTransaction();

	}
}
