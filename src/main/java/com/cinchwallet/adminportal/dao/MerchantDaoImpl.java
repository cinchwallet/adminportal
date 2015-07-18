
package com.cinchwallet.adminportal.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cinchwallet.adminportal.model.Merchant;
import com.cinchwallet.adminportal.model.Store;

@Repository
public class MerchantDaoImpl extends AbstractDao<Integer, Merchant> implements MerchantDao {

	@Override
	public List<Store> getStores(int merchantId) {
		Criteria criteria = getSession().createCriteria(Store.class);
		criteria.add(Restrictions.eq("merchantId", merchantId));
		List<Store> list = criteria.list();
		return list;
	}

}
