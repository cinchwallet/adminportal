package com.cinchwallet.adminportal.dao;

import java.io.Serializable;
import java.util.List;

import com.cinchwallet.adminportal.model.Employee;
import com.cinchwallet.adminportal.model.TxnType;

public interface DataDao extends GenericDao<Serializable, Employee>{

	public List<TxnType> getTxnList();
}
