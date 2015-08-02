package com.cinchwallet.adminportal.services;

import java.util.List;

import com.cinchwallet.adminportal.model.Filter;
import com.cinchwallet.adminportal.model.TxnLog;
import com.cinchwallet.adminportal.model.TxnType;

public interface DataService {
	public List<TxnType> getTxnList();
	
	public List<TxnLog> searchTxn(Filter filter);

}
