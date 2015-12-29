
package com.cinchwallet.adminportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinchwallet.adminportal.dao.CardDao;
import com.cinchwallet.adminportal.model.Card;
import com.cinchwallet.adminportal.model.Filter;

@Transactional
@Service
public class CardServiceImpl implements CardService {

	@Autowired
	CardDao cardDao;

	@Override
	public int save(Card card) {
		cardDao.saveOrUpdate(card);
		return 0;
	}

	@Override
	public List<Card> getList(Filter filter) {
		return cardDao.getAll(filter);
	}

	@Override
	public Card getRowById(int id) {
		Card card = cardDao.getByKey(id);
		return card;
	}

	@Override
	public int update(Card card) {
		cardDao.update(card);
		return 0;
	}

	@Override
	public int delete(int id) {
		Card card = cardDao.getByKey(id);
		cardDao.delete(card);
		return 0;
	}

	
}
