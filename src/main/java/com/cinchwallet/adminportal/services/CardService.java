package com.cinchwallet.adminportal.services;

import java.util.List;

import com.cinchwallet.adminportal.model.Card;
import com.cinchwallet.adminportal.model.Filter;

public interface CardService {
	public int save(Card card);

	public List<Card> getList(Filter filter);

	public Card getRowById(int id);

	public int update(Card cardProduct);

	public int delete(int id);

}
