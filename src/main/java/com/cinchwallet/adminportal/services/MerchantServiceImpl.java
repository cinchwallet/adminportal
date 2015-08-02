
package com.cinchwallet.adminportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinchwallet.adminportal.dao.MerchantDao;
import com.cinchwallet.adminportal.dao.StoreDao;
import com.cinchwallet.adminportal.model.Filter;
import com.cinchwallet.adminportal.model.Merchant;
import com.cinchwallet.adminportal.model.Store;

@Transactional
@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	MerchantDao merchantDao;

	@Autowired
	StoreDao storeDao;

	@Override
	public int save(Merchant merchant) {
		merchantDao.saveOrUpdate(merchant);
		return 0;
	}

	@Override
	public List<Merchant> getList(Filter filter) {
		return merchantDao.getAll(filter);
	}

	@Override
	public List<Merchant> getList() {
		return merchantDao.getAll();
	}

	@Override
	public Merchant getRowById(int id) {
		Merchant merchant = merchantDao.getByKey(id);
		return merchant;
	}

	@Override
	public int update(Merchant merchant) {
		merchantDao.update(merchant);
		return 0;
	}

	@Override
	public int delete(int id) {
		Merchant merchant = merchantDao.getByKey(1);
		merchantDao.delete(merchant);
		return 0;
	}

	@Override
	public String getNextMerchantId() {
		return merchantDao.getNextMerchantId();
	}
	
	@Override
	public Merchant getMerchant(String merchantId) {
		return merchantDao.getMerchant(merchantId);
	}
	
	//Store related functions

	@Override
	public List<Store> getStores(Integer merchantId, Filter filter) {
		return merchantDao.getStores(merchantId, filter);
	}


	@Override
	public int deleteStore(int id) {
		Store store = storeDao.getByKey(id);
		storeDao.delete(store);
		return 0;
	}
	
	@Override
	public Store getStoreById(int id) {
		Store store = storeDao.getByKey(id);
		return store;
	}
	
	@Override
	public int save(Store store) {
		storeDao.saveOrUpdate(store);
		return 0;
	}
	
	@Override
	public int update(Store store) {
		storeDao.update(store);
		return 0;
	}
	
	@Override
	public String getNextStoreId() {
		return storeDao.getNextStoreId();
	}
}
