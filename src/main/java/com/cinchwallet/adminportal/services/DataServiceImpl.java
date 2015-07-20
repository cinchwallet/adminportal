
package com.cinchwallet.adminportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinchwallet.adminportal.dao.DataDao;

@Transactional
@Service
public class DataServiceImpl implements DataService {

	@Autowired
	DataDao dataDao;
	
	public List<com.cinchwallet.adminportal.model.TxnType> getTxnList() {
		return dataDao.getTxnList();
	}
	
}
