package fr.formation.afpa.service;

import java.util.List;

import fr.formation.afpa.dao.DepartmentDao;
import fr.formation.afpa.domain.Department;

public class DepartmentService {
	
	DepartmentDao dao;
	
	public DepartmentService(){
		dao = new DepartmentDao();
	}
	
	public Department findById(Integer id) {	
		Department dept = dao.findById(id);
		return dept;
	}

	public List<Department> findAll() {
		List<Department> list = dao.findAll();
		return list;
	}

	public Integer save(Department e) {
		dao.save(e);
		return e.getDeptId();
	}

	public Integer update(Department e) {
		dao.update(e);
		return e.getDeptId();

	}

	public void delete(Department e) {
		
		dao.delete(e);
	}

	
	public void deleteById(Integer id) {
		Department dept = findById(id);
		dao.delete(dept);

	}
}
