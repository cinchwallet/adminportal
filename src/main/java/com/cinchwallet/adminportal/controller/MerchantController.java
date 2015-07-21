package com.cinchwallet.adminportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cinchwallet.adminportal.constant.Constants;
import com.cinchwallet.adminportal.model.Filter;
import com.cinchwallet.adminportal.model.Merchant;
import com.cinchwallet.adminportal.model.Store;
import com.cinchwallet.adminportal.services.MerchantService;

@Controller
public class MerchantController {
	
	@Autowired
	MerchantService merchantService;
	
	@RequestMapping(Constants.MERCHANT)
	public String showMerchant(@RequestParam(value="name", required=false) String name, @RequestParam(value="mid", required=false) String merchantId, Model model) {
		//show default 10 merchants
		Filter filter = new Filter(null, name, merchantId);
		List<Merchant> mList = merchantService.getList(filter);
		model.addAttribute("merchantList", mList);
		model.addAttribute("filter", filter);
		return Constants.PAGE_MERCHANT;
	}
	
	@RequestMapping(Constants.MERCHANT + Constants.ADD)
	public String addMerchant(Model model) {
		Merchant merchant = new Merchant();
		//generate merchantId here
		merchant.setMerchantId(merchantService.getNextMerchantId());
		model.addAttribute("merchant", merchant);
		return Constants.PAGE_MERCHANT_ADD;
	}
	
	@RequestMapping(Constants.MERCHANT + Constants.EDIT + "/{id}")
	public String editMerchant(@PathVariable("id") int id, Model model) {
		Merchant merchant = merchantService.getRowById(id);
		model.addAttribute("merchant", merchant);
		return Constants.PAGE_MERCHANT_ADD;
	}
	
	@RequestMapping(Constants.MERCHANT + Constants.SAVE)
	public String saveMerchant(@ModelAttribute Merchant merchant) {
		merchantService.save(merchant);
		return "redirect:/merc";
	}
	
	@RequestMapping(Constants.MERCHANT + Constants.DELETE + "/{id}")
	public String deleteMerchant(@PathVariable("id") int id) {
		merchantService.delete(id);
		return "redirect:/merc";
	}
	
	//store related functions
	
	@RequestMapping(Constants.MERCHANT + "/{id}/" + Constants.STORE)
	public String showStores(@PathVariable int id, @RequestParam(value="name", required=false) String name, 
			@RequestParam(value="sid", required=false) String storeId, Model model) {
		//read merchants store
		Merchant merchant = merchantService.getRowById(id);
		Filter filter = new Filter(null, name, merchant.getMerchantId());
		filter.setSid(storeId);
		List<Store> storeList = merchantService.getStores(id, filter);
		model.addAttribute("merchant", merchant);
		model.addAttribute("storeList", storeList);
		model.addAttribute("filter", filter);
		return Constants.PAGE_STORE;
	}	
	
	
	@RequestMapping(Constants.MERCHANT + "/{id}/" + Constants.STORE + Constants.ADD)
	public String addStore(@PathVariable int id, Model model) {
		Store store = new Store();
		store.setMerchantId(id);
		//generate merchantId here
		store.setStoreId(merchantService.getNextStoreId());
		model.addAttribute("store", store);
		return Constants.PAGE_STORE_ADD;
	}
	
	@RequestMapping(Constants.STORE + Constants.EDIT + "/{id}")
	public String editStore(@PathVariable("id") int id, Model model) {
		Store store = merchantService.getStoreById(id);
		model.addAttribute("store", store);
		return Constants.PAGE_STORE_ADD;
	}
	
	@RequestMapping(Constants.STORE + Constants.SAVE)
	public String saveStore(@ModelAttribute Store store) {
		merchantService.save(store);
		return "redirect:/merc/"+store.getMerchantId()+"/"+Constants.STORE;
	}
	
	@RequestMapping(Constants.STORE + Constants.DELETE + "/{id}")
	public String deleteStore(@PathVariable("id") int id) {
		Store store = merchantService.getStoreById(id);
		merchantService.deleteStore(id);
		return "redirect:/merc/"+store.getMerchantId()+"/"+Constants.STORE;
	}

}
