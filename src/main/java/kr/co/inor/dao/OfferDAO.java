package kr.co.inor.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class OfferDAO {
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(DataSource dataSource){
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Offer> getOffers(){
		String sqlStatement = "SELECT * FROM OFFERS";
		
		List<Offer> offerList = jdbcTemplate.query(sqlStatement, new OfferMapper());
		
		return offerList;
	}

	public boolean insertOffer(Offer offer){
		String sqlStatement = "INSERT INTO OFFERS (name, email, text) VALUES(?,?,?)";
		boolean check = false;
		
		check = (jdbcTemplate.update(sqlStatement, new Object[]{offer.getName(), offer.getEmail(), offer.getText()}) == 1);
		
		
		return check;
	}
	
}
