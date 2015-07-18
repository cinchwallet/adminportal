package com.cinchwallet.adminportal.services;

import java.util.List;

import com.cinchwallet.adminportal.model.Merchant;

public interface MerchantService {
	public int save(Merchant merchant);

	public List<Merchant> getList();

	public Merchant getRowById(int id);

	public int update(Merchant employee);

	public int delete(int id);
	
}
