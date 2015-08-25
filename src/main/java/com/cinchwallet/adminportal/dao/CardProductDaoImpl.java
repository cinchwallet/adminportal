
package com.cinchwallet.adminportal.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cinchwallet.adminportal.model.CardProduct;
import com.cinchwallet.adminportal.model.Filter;

@Repository
public class CardProductDaoImpl extends AbstractDao<Integer, CardProduct> implements CardProductDao {

	@Override
	public List<CardProduct> getAll(Filter filter) {
		Criteria criteria = getSession().createCriteria(CardProduct.class);
		if(filter!=null){
			if(filter.getName()!=null && filter.getName().length()>0){
				criteria.add(Restrictions.ilike("name", filter.getName(), MatchMode.ANYWHERE));	
			}
			if(filter.getUpc()!=null && filter.getUpc().length()>0){
				criteria.add(Restrictions.ilike("upc", filter.getUpc(), MatchMode.ANYWHERE));	
			}
			if(filter.getMid()!=null && filter.getMid().length()>0){
				criteria.add(Restrictions.ilike("issuingMerchant", filter.getMid(), MatchMode.ANYWHERE));	
			}
		}
		return criteria.list();
	}
}
