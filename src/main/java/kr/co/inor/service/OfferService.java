package kr.co.inor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.inor.dao.Offer;
import kr.co.inor.dao.OfferDAO;

@Service
public class OfferService {
	OfferDAO offerDAO;

	@Autowired
	public void setOfferDAO(OfferDAO offerDAO) {
		this.offerDAO = offerDAO;
	}

	public List<Offer> getOffers() {
		return offerDAO.getOffers();
	}
	
	public boolean insertOffer(Offer offer){
		boolean check;
		
		check = offerDAO.insertOffer(offer);
		
		return check;
	}

}
