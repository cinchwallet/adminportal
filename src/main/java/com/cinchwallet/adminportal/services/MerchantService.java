package com.cinchwallet.adminportal.services;

import java.util.List;

import com.cinchwallet.adminportal.model.Filter;
import com.cinchwallet.adminportal.model.Merchant;
import com.cinchwallet.adminportal.model.Store;

public interface MerchantService {
	public int save(Merchant merchant);

	public List<Merchant> getList(Filter filter);
	
	public List<Merchant> getList();

	public Merchant getRowById(int id);
	
	public Merchant getMerchant(String merchantId);

	public int update(Merchant employee);

	public int delete(int id);
	
	public String getNextMerchantId();
	
	public List<Store> getStores(Integer merchantId, Filter filter);

	
	public int save(Store store);

	public Store getStoreById(int id);

	public int update(Store store);

	public int deleteStore(int id);

	public String getNextStoreId();
}
