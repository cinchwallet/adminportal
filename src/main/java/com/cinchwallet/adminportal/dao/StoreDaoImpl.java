
package com.cinchwallet.adminportal.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.cinchwallet.adminportal.model.Store;

@Repository
public class StoreDaoImpl extends AbstractDao<Integer, Store> implements StoreDao {

	@Override
	public String getNextStoreId() {
		Query q = getSession().createQuery("select max(storeId) from Store");
	    String sid = (String) q.uniqueResult();
	    if(sid==null){
	    	sid = "10000000000";
	    }
	    Long storeId = Long.parseLong(sid);
		if (storeId == null) {
			storeId = 10000000000L;
		}
		storeId = storeId+1;
		return storeId.toString();

	}

}
