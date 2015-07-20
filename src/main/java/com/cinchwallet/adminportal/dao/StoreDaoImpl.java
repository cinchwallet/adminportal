
package com.cinchwallet.adminportal.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.cinchwallet.adminportal.model.Store;

@Repository
public class StoreDaoImpl extends AbstractDao<Integer, Store> implements StoreDao {

	@Override
	public Long getNextStoreId() {
		Query q = getSession().createQuery("select max(storeId) from Store");
		Long storeId = (Long) q.uniqueResult();
		if (storeId == null) {
			storeId = 10000000000L;
		}
		return storeId + 1;

	}

}
