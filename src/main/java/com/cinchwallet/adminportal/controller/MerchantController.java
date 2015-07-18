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
import com.cinchwallet.adminportal.model.Employee;
import com.cinchwallet.adminportal.model.Merchant;
import com.cinchwallet.adminportal.services.MerchantService;

@Controller
public class MerchantController {
	
	@Autowired
	MerchantService merchantService;
	
	@RequestMapping(Constants.MERCHANT)
	public String showMerchant(Model model) {
		//show default 10 merchants
		List<Merchant> mList = merchantService.getList();
		model.addAttribute("merchantList", mList);
		return Constants.PAGE_MERCHANT;
	}
	
	@RequestMapping(Constants.MERCHANT + Constants.ADD)
	public String addMerchant(Model model) {
		Merchant merchant = new Merchant();
		//generate merchantId here
		merchant.setMerchantId("2347823748");
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
	
	@RequestMapping("store")
	public String showStore(@RequestParam int id, @ModelAttribute Employee employee) {
		//read merchants store
		return Constants.PAGE_STORE;
	}
	

}
