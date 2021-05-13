package fr.formation.afpa.dao;

import java.util.List;

import fr.formation.afpa.domain.Department;

public interface IDepartmentDao {
	public Integer save(Department e);
	public Department update(Department dpt);
	public void delete(Department e);
	public void deleteById(Integer id);
	public List<Department> findAll();
	public Department findById(Integer id);
	void beginTransaction();

	void commitTransaction();
}
