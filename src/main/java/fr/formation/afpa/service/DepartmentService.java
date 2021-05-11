package fr.formation.afpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.afpa.dao.DepartmentDao;
import fr.formation.afpa.dao.IDepartmentDao;
import fr.formation.afpa.dao.IEmployeeDao;
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
		Department dept = dao.findById(id);
		return dept;
	}

	public List<Department> findAll() {
		List<Department> list = dao.findAll();
		return list;
	}

	public Department save(Department e) {
		dao.save(e);
		return e;
	}

	public Department update(Department e) {
		dao.update(e);
		return e;

	}

	public void delete(Department e) {
		
		dao.delete(e);
	}

	
	public void deleteById(Integer id) {
		Department dept = findById(id);
		dao.delete(dept);

	}
}
