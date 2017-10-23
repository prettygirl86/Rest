package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="paxReference")
@XmlType(propOrder={"ptc","traveller"})
public class PaxReferVO {

	String ptc;
	TravellerVO traveller;
	
	
	public String getPtc() {
		return ptc;
	}
	public void setPtc(String ptc) {
		this.ptc = ptc;
	}
	public TravellerVO getTraveller() {
		return traveller;
	}
	public void setTraveller(TravellerVO traveller) {
		this.traveller = traveller;
	}
	
}
