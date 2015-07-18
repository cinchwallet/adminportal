package com.cinchwallet.adminportal.dao;

import java.io.Serializable;

import com.cinchwallet.adminportal.model.User;
import com.cinchwallet.adminportal.model.UserLogin;

public interface UserDao extends GenericDao<Serializable, User>{

	
	public UserLogin loadUserByUsername(String username);
}
