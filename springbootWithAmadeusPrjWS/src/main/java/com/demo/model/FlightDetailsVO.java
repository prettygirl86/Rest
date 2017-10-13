package com.demo.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="flightDetails")
public class FlightDetailsVO {

	FlightInfoVO flightInformation;

	@XmlElement
	public FlightInfoVO getFlightInformation() {
		return flightInformation;
	}

	public void setFlightInformation(FlightInfoVO flightInformation) {
		this.flightInformation = flightInformation;
	}
	
}
