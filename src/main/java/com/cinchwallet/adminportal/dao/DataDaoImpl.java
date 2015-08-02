
package com.cinchwallet.adminportal.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cinchwallet.adminportal.model.Employee;
import com.cinchwallet.adminportal.model.Filter;
import com.cinchwallet.adminportal.model.TxnLog;
import com.cinchwallet.adminportal.model.TxnType;

@Repository
public class DataDaoImpl extends AbstractDao<Integer, Employee> implements DataDao {

	@Override
	public List<TxnType> getTxnList() {
		return getSession().createCriteria(TxnType.class).list();
	}

	@Override
	public List<TxnLog> searchTxn(Filter filter) {
		Criteria criteria = getSession().createCriteria(TxnLog.class);
		if(filter.getMid()!=null && filter.getMid().length()>0){
			criteria.add(Restrictions.ilike("mid", filter.getMid(), MatchMode.ANYWHERE));	
		}
		if(filter.getSid()!=null && filter.getSid().length()>0){
			criteria.add(Restrictions.ilike("sid", filter.getSid(), MatchMode.ANYWHERE));	
		}
		if(filter.getCardNumber()!=null && filter.getCardNumber().length()>0){
			criteria.add(Restrictions.ilike("panHint", filter.getCardNumber(), MatchMode.END));	
		}
		if(filter.getTxnDate()!=null){
			criteria.add(Restrictions.ilike("dtTransaction", filter.getTxnDate(), MatchMode.ANYWHERE));	
		}
		return criteria.list();
	}
}
