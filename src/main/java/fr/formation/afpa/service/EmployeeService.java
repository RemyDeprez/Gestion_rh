package fr.formation.afpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.afpa.dao.IEmployeeDao;
import fr.formation.afpa.domain.Employee;

@Service
@Transactional
public class EmployeeService implements IEmployeeService {
	@Autowired
	private IEmployeeDao dao;

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
		dao.beginTransaction();
		dao.save(e);
		dao.commitTransaction();
		return e;
	}

	public Employee update(Employee e) {
		dao.beginTransaction();
		dao.update(e);
		dao.commitTransaction();
		return e;

	}

	public void delete(Employee e) {
		dao.beginTransaction();
		dao.delete(e);
		dao.commitTransaction();
	}

	public List<Employee> findManager() {
		dao.beginTransaction();
		List<Employee> listManager = dao.findManager();
		dao.commitTransaction();
		return listManager;
	}
	public List<Employee> findEmployee(){
		dao.beginTransaction();
		List<Employee> listEmployee  = dao.findEmployee();
		dao.commitTransaction();
		return listEmployee;
		
	}
	public List<Employee> findUnManaged(){
		dao.beginTransaction();
		List<Employee> listUnManaged  = dao.findUnManaged();
		dao.commitTransaction();
		return listUnManaged;
		
	}

	public void deleteById(Integer id) {
		dao.beginTransaction();
		dao.deleteById(id);
		dao.commitTransaction();

	}
}
