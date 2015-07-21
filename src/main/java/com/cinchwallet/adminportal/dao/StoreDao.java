package com.cinchwallet.adminportal.dao;

import java.io.Serializable;

import com.cinchwallet.adminportal.model.Store;

public interface StoreDao extends GenericDao<Serializable, Store>{

	public String getNextStoreId();
}
