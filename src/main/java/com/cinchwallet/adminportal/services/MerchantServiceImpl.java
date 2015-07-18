
package com.cinchwallet.adminportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinchwallet.adminportal.dao.MerchantDao;
import com.cinchwallet.adminportal.model.Merchant;

@Transactional
@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	MerchantDao merchantDao;

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

	

	
}
