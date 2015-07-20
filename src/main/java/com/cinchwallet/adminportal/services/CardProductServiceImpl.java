
package com.cinchwallet.adminportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinchwallet.adminportal.dao.CardProductDao;
import com.cinchwallet.adminportal.model.CardProduct;

@Transactional
@Service
public class CardProductServiceImpl implements CardProductService {

	@Autowired
	CardProductDao cardProductDao;

	@Override
	public int save(CardProduct cardProduct) {
		cardProductDao.saveOrUpdate(cardProduct);
		return 0;
	}

	@Override
	public List<CardProduct> getList() {
		return cardProductDao.getAll();
	}

	@Override
	public CardProduct getRowById(int id) {
		CardProduct cardProduct = cardProductDao.getByKey(id);
		return cardProduct;
	}

	@Override
	public int update(CardProduct cardProduct) {
		cardProductDao.update(cardProduct);
		return 0;
	}

	@Override
	public int delete(int id) {
		CardProduct cardProduct = cardProductDao.getByKey(id);
		cardProductDao.delete(cardProduct);
		return 0;
	}
}
