
package com.cinchwallet.adminportal.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cinchwallet.adminportal.model.CardProduct;
import com.cinchwallet.adminportal.model.Filter;
import com.cinchwallet.adminportal.model.Merchant;
import com.cinchwallet.adminportal.model.Store;

@Repository
public class MerchantDaoImpl extends AbstractDao<Integer, Merchant> implements MerchantDao {

	@Override
	public List<Store> getStores(int merchantId, Filter filter) {
		Criteria criteria = getSession().createCriteria(Store.class);
		criteria.add(Restrictions.eq("merchantId", merchantId));
		if (filter != null) {
			if (filter.getName() != null && filter.getName().length() > 0) {
				criteria.add(Restrictions.ilike("name", filter.getName(), MatchMode.ANYWHERE));
			}
			if (filter.getSid() != null && filter.getSid().length() > 0) {
				criteria.add(Restrictions.ilike("storeId", filter.getSid(), MatchMode.ANYWHERE));
			}
		}
		List<Store> list = criteria.list();
		return list;
	}

	
	@Override
	public String getNextMerchantId() {
	    Query q = getSession().createQuery("select max(merchantId) from Merchant");
	    Long merchantId = (Long) q.uniqueResult();
	    if(merchantId==null){
	    	merchantId = 10000000000L;
	    }
	    merchantId = merchantId+1;
		return merchantId.toString();
	}

	
	@Override
	public List<Merchant> getAll(Filter filter) {
		Criteria criteria = getSession().createCriteria(Merchant.class);
		if(filter.getName()!=null && filter.getName().length()>0){
			criteria.add(Restrictions.ilike("name", filter.getName(), MatchMode.ANYWHERE));	
		}
		if(filter.getMid()!=null && filter.getMid().length()>0){
			criteria.add(Restrictions.ilike("merchantId", filter.getMid(), MatchMode.ANYWHERE));	
		}
		return criteria.list();

	}
}
