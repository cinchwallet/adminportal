
package com.cinchwallet.adminportal.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cinchwallet.adminportal.model.Employee;
import com.cinchwallet.adminportal.model.TxnType;

@Repository
public class DataDaoImpl extends AbstractDao<Integer, Employee> implements DataDao {

	@Override
	public List<TxnType> getTxnList() {
		return getSession().createCriteria(TxnType.class).list();
	}

}
