package com.cinchwallet.adminportal.dao;

import java.io.Serializable;
import java.util.List;

import com.cinchwallet.adminportal.model.Card;
import com.cinchwallet.adminportal.model.Filter;

public interface CardDao extends GenericDao<Serializable, Card>{

	public List<Card> getAll(Filter filter);
}
