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
import com.cinchwallet.adminportal.model.Card;
import com.cinchwallet.adminportal.model.CardProduct;
import com.cinchwallet.adminportal.model.Filter;
import com.cinchwallet.adminportal.model.Merchant;
import com.cinchwallet.adminportal.model.PromoOffer;
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
	public String showCardProduct(@RequestParam(value="name", required=false) String name, @RequestParam(value="upc", required=false) String upc, 
				@RequestParam(value="mid", required=false) String merchantId, Model model) {
		//show default 10 card product
		Filter filter = new Filter(upc, name, merchantId); 
		List<CardProduct> cpList = cardProductService.getList(filter);
		model.addAttribute("cardProductList", cpList);
		List<Merchant> mList = merchantService.getList();
		model.addAttribute("merchantList", mList);
		model.addAttribute("filter", filter);
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
	

	//Offer API
	
    @RequestMapping(Constants.OFFER)
	public String showOffer(@RequestParam(value="code", required=false) String promoCode, @RequestParam(value="upc", required=false) String upc, 
				Model model) {
		//show default 10 card product
		Filter filter = new Filter(upc, null, null); 
		filter.setPromoCode(promoCode);
		
		List<CardProduct> cpList = cardProductService.getList(null);
		model.addAttribute("cardProductList", cpList);
		
		List<PromoOffer> offerList = cardProductService.getOffers(filter);
		model.addAttribute("offerList", offerList);
		model.addAttribute("filter", filter);
		return Constants.PAGE_OFFER;
	}
	
	@RequestMapping(Constants.OFFER + Constants.ADD)
	public String addOffer(Model model) {
		PromoOffer promoOffer = new PromoOffer();
		model.addAttribute("offer", promoOffer);
		
		List<CardProduct> cpList = cardProductService.getList(null);
		model.addAttribute("cardProductList", cpList);
		return Constants.PAGE_OFFER_ADD;
	}
	
	@RequestMapping(Constants.OFFER + Constants.EDIT + "/{id}")
	public String editOffer(@PathVariable("id") int id, Model model) {
		PromoOffer promoOffer = cardProductService.getPromoOffer(id);
		model.addAttribute("offer", promoOffer);
		List<CardProduct> cpList = cardProductService.getList(null);
		model.addAttribute("cardProductList", cpList);
		return Constants.PAGE_OFFER_ADD;
	}
	
	@RequestMapping(Constants.OFFER + Constants.SAVE)
	public String saveOffer(@ModelAttribute PromoOffer promoOffer) {
		cardProductService.save(promoOffer);
		return "redirect:/offer";
	}
	
	@RequestMapping(Constants.OFFER+ Constants.DELETE + "/{id}")
	public String deleteCard(@PathVariable("id") int id) {
		cardProductService.deletePromoOffer(id);
		return "redirect:/offer";
	}

	
}
