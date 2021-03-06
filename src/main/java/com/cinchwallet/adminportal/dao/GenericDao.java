
package com.cinchwallet.adminportal.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<PK extends Serializable, T> {

	public T getByKey(PK key);
	public Serializable save(T entity);
	public void saveOrUpdate(T entity);
	public void delete(T entity);
	public void update(T entity);
	public List<T> getAll();

}