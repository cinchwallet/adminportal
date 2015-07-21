package com.cinchwallet.adminportal.services;

import java.util.List;

import com.cinchwallet.adminportal.model.CardProduct;
import com.cinchwallet.adminportal.model.Filter;

public interface CardProductService {
	public int save(CardProduct cardProduct);

	public List<CardProduct> getList(Filter filter);

	public CardProduct getRowById(int id);

	public int update(CardProduct cardProduct);

	public int delete(int id);

}
