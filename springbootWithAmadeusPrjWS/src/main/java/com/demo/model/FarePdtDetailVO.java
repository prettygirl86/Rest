package com.demo.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="fareProductDetail")
@XmlType(propOrder={"fareBasis","passengerType","fareType"})
public class FarePdtDetailVO {
 
	String fareBasis;
	String passengerType;
	String fareType;
	String breakPoint;
	
	@XmlElement
	public String getFareBasis() {
		return fareBasis;
	}
	public void setFareBasis(String fareBasis) {
		this.fareBasis = fareBasis;
	}
	
	@XmlElement
	public String getPassengerType() {
		return passengerType;
	}
	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}
	
	@XmlElement
	public String getFareType() {
		return fareType;
	}
	public void setFareType(String fareType) {
		this.fareType = fareType;
	}
	
}
