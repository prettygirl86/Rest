package com.demo.model;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;


@XmlRootElement(name="Fare_MasterPricerTravelBoardSearchReply")
@XmlType(propOrder= {"flightindex","recommendation"})
public class FareMasterPriceResponseVO implements Serializable {
	
	FlightIndexVO flightindex;
	List<RecommendationVO> recommendation;
	
	@XmlElement
	public FlightIndexVO getFlightindex() {
		return flightindex;
	}
	public void setFlightindex(FlightIndexVO flightindex) {
		this.flightindex = flightindex;
	}
	
	@XmlList
	public List<RecommendationVO> getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(List<RecommendationVO> recommendation) {
		this.recommendation = recommendation;
	}
}
