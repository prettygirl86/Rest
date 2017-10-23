package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="groupOfFlights")
public class GroupOfFlightsVO {
	
	List <FlightDetailsVO> flightDetails;

	@XmlElement
	public List<FlightDetailsVO> getFlightDetails() {
		return flightDetails;
	}

	public void setFlightDetails(List<FlightDetailsVO> flightDetails) {
		this.flightDetails = flightDetails;
	}
	
	
	
	
	

	

}
