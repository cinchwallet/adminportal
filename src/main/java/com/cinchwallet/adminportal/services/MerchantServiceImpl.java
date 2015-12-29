
package com.cinchwallet.adminportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.cinchwallet.adminportal.constant.AppConstant;
import com.cinchwallet.adminportal.dao.MerchantDao;
import com.cinchwallet.adminportal.dao.StoreDao;
import com.cinchwallet.adminportal.dao.UserDao;
import com.cinchwallet.adminportal.model.Filter;
import com.cinchwallet.adminportal.model.Merchant;
import com.cinchwallet.adminportal.model.Store;
import com.cinchwallet.adminportal.model.UserLogin;
import com.cinchwallet.adminportal.util.Util;

@Transactional
@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	MerchantDao merchantDao;

	@Autowired
	StoreDao storeDao;
	
	@Autowired
	UserDao userDao;

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
		UserLogin userLogin = userDao.getByTypeAndId(AppConstant.UserType.STORE_USER, store.getUid().longValue());
		store.setUserName(userLogin.getUserName());
		return store;
	}
	
	@Override
	public int save(Store store) {
		
		Integer storeId = null;
		if(store.getUid()==null){
			storeId = (Integer)storeDao.save(store);
			//create store. login credential should be created
			UserLogin login = new UserLogin();
			login.setUserName(store.getUserName());
			login.setPassword(Util.getMD5(store.getPassword()));
			login.setUserType(AppConstant.UserType.STORE_USER.getUserTypeCode());
			login.setParentId(storeId.longValue());
			login.setStatus(true);
			userDao.save(login);
		}else{
			storeDao.update(store);
			//login credential should be updated. Only if password has been provided
			if(store.getPassword()!=null && !StringUtils.isEmpty(store.getPassword())){
				//read the existing credential, update the password and update into table
				UserLogin userLogin = userDao.loadUserByUsername(store.getUserName());
				userLogin.setPassword(Util.getMD5(store.getPassword()));
				userDao.save(userLogin);
			}
		}

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
