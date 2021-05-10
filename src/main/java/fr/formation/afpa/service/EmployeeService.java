package fr.formation.afpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.afpa.dao.EmployeeDao;
import fr.formation.afpa.dao.IEmployeeDao;
import fr.formation.afpa.domain.Employee;

@Service
@Transactional
public class EmployeeService implements IEmployeeService {
	@Autowired
	private IEmployeeDao dao ;

	
	public IEmployeeDao getDao() {
		return dao;
	}

	public Employee findById(Integer id) {	
		dao.beginTransaction();
		Employee dept = dao.findById(id);
		dao.commitTransaction();
		return dept;
	}

	public List<Employee> findAll() {
		dao.beginTransaction();
		List<Employee> list = dao.findAll();
		dao.commitTransaction();
		return list;
	}

	public Employee save(Employee e) {
		dao.save(e);
		return e;
	}

	public Employee update(Employee e) {
		dao.update(e);
		return e;

	}

	public void delete(Employee e) {
		
		dao.delete(e);
	}

	
	public void deleteById(Integer id) {
		Employee e = findById(id);
		dao.delete(e);

	}
}
