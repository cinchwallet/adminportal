package com.cinchwallet.adminportal.dao;

import java.io.Serializable;
import java.util.List;

import com.cinchwallet.adminportal.model.Merchant;
import com.cinchwallet.adminportal.model.Store;

public interface MerchantDao extends GenericDao<Serializable, Merchant>{

	public List<Store> getStores(int merchantId);
	
	public Long getNextMerchantId();
}
