package com.client.model;

import java.io.Serializable;
import java.util.List;

public class Flights implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6190903640337153276L;
	private List<FlightDetailsVO> flights;

	public List<FlightDetailsVO> getFlights() {
		return flights;
	}

	public void setFlights(List<FlightDetailsVO> flights) {
		this.flights = flights;
	}

}
