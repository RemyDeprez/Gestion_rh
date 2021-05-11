package fr.formation.afpa.service;

import java.util.List;

import fr.formation.afpa.domain.Department;

public interface IDepartmentService {
	public Department findById(Integer id);

	public List<Department> findAll() ;

	public Department save(Department e);

	public Department update(Department e);

	public void delete(Department e) ;


	
	public void deleteById(Integer id);
}

