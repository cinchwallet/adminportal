package com.cinchwallet.adminportal.dao;

import java.io.Serializable;
import java.util.List;

import com.cinchwallet.adminportal.model.Filter;
import com.cinchwallet.adminportal.model.PromoOffer;

public interface OfferDao extends GenericDao<Serializable, PromoOffer>{

	public List<PromoOffer> getAll(Filter filter);
}
