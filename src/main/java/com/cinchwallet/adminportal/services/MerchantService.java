package com.cinchwallet.adminportal.services;

import java.util.List;

import com.cinchwallet.adminportal.model.Merchant;
import com.cinchwallet.adminportal.model.Store;

public interface MerchantService {
	public int save(Merchant merchant);

	public List<Merchant> getList();

	public Merchant getRowById(int id);

	public int update(Merchant employee);

	public int delete(int id);
	
	public List<Store> getStores(int merchantId);

	
	public int save(Store store);

	public Store getStoreById(int id);

	public int update(Store store);

	public int deleteStore(int id);

}
