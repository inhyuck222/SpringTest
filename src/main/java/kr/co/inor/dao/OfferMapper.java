package kr.co.inor.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OfferMapper implements RowMapper<Offer> {

	@Override
	public Offer mapRow(ResultSet rs, int arg1) throws SQLException {
		Offer offer = new Offer();
		
		offer.setId(rs.getInt("id"));
		offer.setEmail(rs.getString("email"));
		offer.setName(rs.getString("name"));
		offer.setText(rs.getString("text"));
		
		return offer;
	}

}
