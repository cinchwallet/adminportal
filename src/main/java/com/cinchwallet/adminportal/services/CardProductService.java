package com.cinchwallet.adminportal.services;

import java.util.List;

import com.cinchwallet.adminportal.model.CardProduct;

public interface CardProductService {
	public int save(CardProduct cardProduct);

	public List<CardProduct> getList();

	public CardProduct getRowById(int id);

	public int update(CardProduct cardProduct);

	public int delete(int id);

}
