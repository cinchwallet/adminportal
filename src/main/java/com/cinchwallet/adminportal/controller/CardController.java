package com.cinchwallet.adminportal.controller;

import java.util.List;

import org.apache.log4j.Logger;
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
import com.cinchwallet.adminportal.services.CardProductService;
import com.cinchwallet.adminportal.services.CardService;

@Controller
@RequestMapping("/")
public class CardController {

    protected static Logger logger = Logger.getLogger("CardController");

    @Autowired
	CardService cardService;

    @Autowired
	CardProductService cardProductService;


    /**
     * Card Controller Listing
     */

    @RequestMapping(Constants.CARD)
	public String showCard(@RequestParam(value="number", required=false) String cardNumber, @RequestParam(value="upc", required=false) String upc, 
				Model model) {
		//show default 10 card product
		Filter filter = new Filter(upc, null, null); 
		filter.setCardNumber(cardNumber);
		
		List<CardProduct> cpList = cardProductService.getList(null);
		model.addAttribute("cardProductList", cpList);
		
		List<Card> cardList = cardService.getList(filter);
		model.addAttribute("cardList", cardList);
		model.addAttribute("filter", filter);
		return Constants.PAGE_CARD;
	}
	
	@RequestMapping(Constants.CARD + Constants.ADD)
	public String addCard(Model model) {
		Card card = new Card();
		model.addAttribute("card", card);
		
		List<CardProduct> cpList = cardProductService.getList(null);
		model.addAttribute("cardProductList", cpList);
		return Constants.PAGE_CARD_ADD;
	}
	
	@RequestMapping(Constants.CARD + Constants.EDIT + "/{id}")
	public String editCard(@PathVariable("id") int id, Model model) {
		Card card = cardService.getRowById(id);
		model.addAttribute("card", card);
		List<CardProduct> cpList = cardProductService.getList(null);
		model.addAttribute("cardProductList", cpList);
		return Constants.PAGE_CARD_ADD;
	}
	
	@RequestMapping(Constants.CARD + Constants.SAVE)
	public String saveCard(@ModelAttribute Card card) {
		cardService.save(card);
		return "redirect:/crd";
	}
	
	@RequestMapping(Constants.CARD + Constants.DELETE + "/{id}")
	public String deleteCard(@PathVariable("id") int id) {
		cardService.delete(id);
		return "redirect:/crd";
	}
}
