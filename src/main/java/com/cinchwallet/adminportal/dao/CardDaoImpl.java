
package com.cinchwallet.adminportal.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cinchwallet.adminportal.model.Card;
import com.cinchwallet.adminportal.model.Filter;

@Repository
public class CardDaoImpl extends AbstractDao<Integer, Card> implements CardDao {

	@Override
	public List<Card> getAll(Filter filter) {
		Criteria criteria = getSession().createCriteria(Card.class);
		if(filter.getCardNumber()!=null && filter.getCardNumber().length()>0){
			criteria.add(Restrictions.ilike("number", filter.getCardNumber(), MatchMode.ANYWHERE));	
		}
		if(filter.getUpc()!=null && filter.getUpc().length()>0){
			criteria.add(Restrictions.ilike("cardProduct", filter.getUpc(), MatchMode.ANYWHERE));	
		}
		return criteria.list();
	}

}
