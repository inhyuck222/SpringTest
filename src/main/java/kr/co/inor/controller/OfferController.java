package kr.co.inor.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.inor.dao.Offer;
import kr.co.inor.service.OfferService;

@Controller
public class OfferController {
	OfferService offerService;
	
	@Autowired
	public void setOfferService(OfferService offerService){
		this.offerService = offerService;
	}
	
	@RequestMapping(value="/offers")
	public String showOffers(Model model){
		List<Offer> offers = offerService.getOffers();
		
		model.addAttribute("offers", offers);
		
		return "offersPage";
	}
	
	@RequestMapping(value="/createOffer")
	public String createOffer(Model model){
		model.addAttribute("offer", new Offer());
		
		return "createOfferPage";
	}
	
	@RequestMapping(value="/doCreate")
	public String insertOffer(Model model, @Valid @ModelAttribute Offer offer, BindingResult bindngResult){
		if(bindngResult.hasErrors()){
			List<ObjectError> errors = bindngResult.getAllErrors();
			
			for(ObjectError error :  errors){
				System.out.println(error.getDefaultMessage());
			}
			
			return "createOfferPage";
		}
		
		offerService.insertOffer(offer);
		model.addAttribute("insertedOffer", offer);
		
		return "offerCreatedPage";
	}

}
