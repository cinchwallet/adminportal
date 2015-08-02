package com.cinchwallet.adminportal.dao;

import java.io.Serializable;
import java.util.List;

import com.cinchwallet.adminportal.model.Employee;
import com.cinchwallet.adminportal.model.Filter;
import com.cinchwallet.adminportal.model.TxnLog;
import com.cinchwallet.adminportal.model.TxnType;

public interface DataDao extends GenericDao<Serializable, Employee>{

	public List<TxnType> getTxnList();
	
	public List<TxnLog> searchTxn(Filter filter);
}
