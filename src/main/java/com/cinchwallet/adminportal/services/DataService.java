package com.cinchwallet.adminportal.services;

import java.util.List;

import com.cinchwallet.adminportal.model.Employee;

public interface DataService {
	public int save(Employee employee);

	public List<Employee> getList();

	public Employee getRowById(int id);

	public int update(Employee employee);

	public int delete(int id);

}
