package com.cinchwallet.adminportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cinchwallet.adminportal.constant.Constants;
import com.cinchwallet.adminportal.model.CardProduct;
import com.cinchwallet.adminportal.model.Merchant;
import com.cinchwallet.adminportal.model.TxnType;
import com.cinchwallet.adminportal.services.CardProductService;
import com.cinchwallet.adminportal.services.DataService;
import com.cinchwallet.adminportal.services.MerchantService;

@Controller
public class CardProductController {
	
	@Autowired
	CardProductService cardProductService;
	
	@Autowired
	MerchantService merchantService;

	@Autowired
	DataService dataService;

	@RequestMapping(Constants.CARD_PRODUCT)
	public String showCardProduct(Model model) {
		//show default 10 card product
		List<CardProduct> cpList = cardProductService.getList();
		model.addAttribute("cardProductList", cpList);
		return Constants.PAGE_CARDPRODUCT;
	}
	
	@RequestMapping(Constants.CARD_PRODUCT + Constants.ADD)
	public String addCardProduct(Model model) {
		CardProduct cardProduct = new CardProduct();
		model.addAttribute("cardProduct", cardProduct);
		List<Merchant> mList = merchantService.getList();
		model.addAttribute("merchantList", mList);
		List<TxnType> txnList = dataService.getTxnList();
		model.addAttribute("txnList", txnList);
		return Constants.PAGE_CARDPRODUCT_ADD;
	}
	
	@RequestMapping(Constants.CARD_PRODUCT + Constants.EDIT + "/{id}")
	public String editCardProduct(@PathVariable("id") int id, Model model) {
		CardProduct cardProduct = cardProductService.getRowById(id);
		model.addAttribute("cardProduct", cardProduct);
		List<Merchant> mList = merchantService.getList();
		model.addAttribute("merchantList", mList);
		List<TxnType> txnList = dataService.getTxnList();
		model.addAttribute("txnList", txnList);
		return Constants.PAGE_CARDPRODUCT_ADD;
	}
	
	@RequestMapping(Constants.CARD_PRODUCT + Constants.SAVE)
	public String saveCardProduct(@ModelAttribute CardProduct cardProduct) {
		cardProductService.save(cardProduct);
		return "redirect:/crdpdt";
	}
	
	@RequestMapping(Constants.CARD_PRODUCT + Constants.DELETE + "/{id}")
	public String deleteMerchant(@PathVariable("id") int id) {
		cardProductService.delete(id);
		return "redirect:/crdpdt";
	}
	
	
}
