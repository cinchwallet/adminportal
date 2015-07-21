package com.cinchwallet.adminportal.dao;

import java.io.Serializable;
import java.util.List;

import com.cinchwallet.adminportal.model.CardProduct;
import com.cinchwallet.adminportal.model.Filter;

public interface CardProductDao extends GenericDao<Serializable, CardProduct>{

	public List<CardProduct> getAll(Filter filter);
}
