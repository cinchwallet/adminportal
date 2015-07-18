
package com.cinchwallet.adminportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinchwallet.adminportal.dao.DataDao;
import com.cinchwallet.adminportal.model.Employee;

@Transactional
@Service
public class DataServiceImpl implements DataService {

	@Autowired
	DataDao dataDao;

	@Override
	public int save(Employee employee) {
		dataDao.save(employee);
		return 0;
	}

	@Override
	public List<Employee> getList() {
		return dataDao.getAll();
	}

	@Override
	public Employee getRowById(int id) {
		return dataDao.getByKey(id);
	}

	@Override
	public int update(Employee employee) {
		dataDao.update(employee);
		return 0;
	}

	@Override
	public int delete(int id) {
		Employee e = getRowById(id);
		dataDao.delete(e);
		return 0;
	}

}
