
package com.cinchwallet.adminportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinchwallet.adminportal.dao.CardProductDao;
import com.cinchwallet.adminportal.dao.OfferDao;
import com.cinchwallet.adminportal.model.CardProduct;
import com.cinchwallet.adminportal.model.Filter;
import com.cinchwallet.adminportal.model.PromoOffer;

@Transactional
@Service
public class CardProductServiceImpl implements CardProductService {

	@Autowired
	CardProductDao cardProductDao;
	
	@Autowired
	OfferDao offerDao;

	@Override
	public int save(CardProduct cardProduct) {
		cardProductDao.saveOrUpdate(cardProduct);
		return 0;
	}

	@Override
	public List<CardProduct> getList(Filter filter) {
		return cardProductDao.getAll(filter);
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

	@Override
	public List<PromoOffer> getOffers(Filter filter) {
		return offerDao.getAll(filter);
	}

	@Override
	public int save(PromoOffer promoOffer) {
		offerDao.saveOrUpdate(promoOffer);
		return 0;
	}

	@Override
	public PromoOffer getPromoOffer(int id) {
		PromoOffer promoOffer = offerDao.getByKey(id);
		return promoOffer;
	}

	@Override
	public int update(PromoOffer promoOffer) {
		offerDao.update(promoOffer);
		return 0;
	}

	@Override
	public int deletePromoOffer(int id) {
		PromoOffer promoOffer = offerDao.getByKey(id);
		offerDao.delete(promoOffer);
		return 0;
	}
}
