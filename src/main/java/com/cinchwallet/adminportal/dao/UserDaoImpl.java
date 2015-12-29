
package com.cinchwallet.adminportal.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cinchwallet.adminportal.constant.AppConstant.UserType;
import com.cinchwallet.adminportal.model.User;
import com.cinchwallet.adminportal.model.UserLogin;

@Repository
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

	public UserLogin loadUserByUsername(String username){
		Criteria criteria = getSession().createCriteria(UserLogin.class);
		criteria.add(Restrictions.eq("userName", username));
		//TODO - need to do md5 here
		criteria.add(Restrictions.eq("status", true));
		
		List<UserLogin> list = criteria.list();
		if(list!=null && list.size()>0){
			return list.get(0);
		}
		return null;
		
	}

	@Override
	public void save(UserLogin userLogin) {
		getSession().saveOrUpdate(userLogin);
	}

	@Override
	public UserLogin getByTypeAndId(UserType userType, Long entityId) {
		Criteria criteria = getSession().createCriteria(UserLogin.class);
		criteria.add(Restrictions.eq("userType", userType.getUserTypeCode()));
		criteria.add(Restrictions.eq("parentId", entityId));
		List<UserLogin> list = criteria.list();
		if(list!=null && list.size()>0){
			return list.get(0);
		}
		return null;
		
	}
 

}
