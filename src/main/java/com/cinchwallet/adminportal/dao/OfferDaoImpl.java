
package com.cinchwallet.adminportal.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cinchwallet.adminportal.model.Filter;
import com.cinchwallet.adminportal.model.PromoOffer;

@Repository
public class OfferDaoImpl extends AbstractDao<Integer, PromoOffer> implements OfferDao {

	@Override
	public List<PromoOffer> getAll(Filter filter) {
		Criteria criteria = getSession().createCriteria(PromoOffer.class);
		if(filter.getUpc()!=null && filter.getUpc().length()>0){
			criteria.add(Restrictions.ilike("cardProduct", filter.getUpc(), MatchMode.ANYWHERE));	
		}
		return criteria.list();
	}

}
