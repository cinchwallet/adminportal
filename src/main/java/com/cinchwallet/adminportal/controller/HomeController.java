package com.cinchwallet.adminportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.cinchwallet.adminportal.constant.Constants;
import com.cinchwallet.adminportal.model.Filter;
import com.cinchwallet.adminportal.model.Merchant;
import com.cinchwallet.adminportal.model.Store;
import com.cinchwallet.adminportal.model.TxnLog;
import com.cinchwallet.adminportal.security.User;
import com.cinchwallet.adminportal.services.DataService;
import com.cinchwallet.adminportal.services.MerchantService;

@Controller
public class HomeController {
	
	@Autowired
	DataService dataService;
	
	@Autowired
	MerchantService merchantService;

	@RequestMapping("home")
	public String getForm(Model model) {
		Authentication authentication  = SecurityContextHolder.getContext().getAuthentication();
		System.out.println(authentication);
		User user = (User)authentication.getPrincipal();
		if(user.getUsername().equalsIgnoreCase("manoj")){
			return Constants.PAGE_HOME;	
		}else{
			return Constants.PAGE_CMS_HOME;
		}
		
	}
	
	@RequestMapping("txn")
	public String searchTxn(@RequestParam(value="mid", required=false) String mid, @RequestParam(value="sid", required=false) String sid, 
			@RequestParam(value="crd", required=false) String card, @RequestParam(value="txnDate", required=false) String txnDate, 
			@RequestParam(value="ms", required=false) String ms, Model model) {
		
		Filter filter = new Filter(mid, sid, card, txnDate);
		Integer merchantId = null;
		
		try {
			merchantId = Integer.parseInt(mid);
		} catch (NumberFormatException e) {
		}
		Merchant merchant = merchantService.getMerchant(mid);
		if(merchant!=null){
			merchantId = merchant.getUid();
		}
		
		List<Store> storeList = merchantService.getStores(merchantId, null);
		//populate stores only if merchant is selected.
		if(merchantId!=null)
			model.addAttribute("storeList", storeList);
		
		if("true".equals(ms)){
			//get the store list only
		}else{
			List<TxnLog> txnList = dataService.searchTxn(filter);
			model.addAttribute("txnList", txnList);
		}
		List<Merchant> merchantList = merchantService.getList();
		model.addAttribute("merchantList", merchantList);
		model.addAttribute("filter", filter);
		return Constants.PAGE_TRANSACTION;
	}

	@RequestMapping("logout")
	public String logout(Model model) {
		return Constants.PAGE_HOME;
	}
	
}
