
package com.cinchwallet.adminportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinchwallet.adminportal.dao.MerchantDao;
import com.cinchwallet.adminportal.dao.StoreDao;
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
	public Long getNextMerchantId() {
		return merchantDao.getNextMerchantId();
	}
	
	//Store related functions

	@Override
	public List<Store> getStores(int merchantId) {
		return merchantDao.getStores(merchantId);
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
	public Long getNextStoreId() {
		return storeDao.getNextStoreId();
	}
}
