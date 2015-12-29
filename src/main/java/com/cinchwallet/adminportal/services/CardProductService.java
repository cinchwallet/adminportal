package com.cinchwallet.adminportal.services;

import java.util.List;

import com.cinchwallet.adminportal.model.CardProduct;
import com.cinchwallet.adminportal.model.Filter;
import com.cinchwallet.adminportal.model.PromoOffer;

public interface CardProductService {
	public int save(CardProduct cardProduct);

	public List<CardProduct> getList(Filter filter);

	public CardProduct getRowById(int id);

	public int update(CardProduct cardProduct);

	public int delete(int id);
	
	public List<PromoOffer> getOffers(Filter filter);
	
	public int save(PromoOffer promoOffer);

	public PromoOffer getPromoOffer(int id);

	public int update(PromoOffer promoOffer);

	public int deletePromoOffer(int id);

}
