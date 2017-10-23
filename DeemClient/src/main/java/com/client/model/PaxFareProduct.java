package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="paxFareProduct")
@XmlType(propOrder={"paxFareDetail","paxReference","passengerTaxDetails","fare","fareDetails"})
public class PaxFareProduct {

	PaxFareDetailVO paxFareDetail;
	PaxReferVO paxReference;
	PaxTaxDetailsVO passengerTaxDetails;
	List<FareVO> fare;
	FareDetailsVO fareDetails;
	
	
	@XmlElement
	public PaxFareDetailVO getPaxFareDetail() {
		return paxFareDetail;
	}
	public void setPaxFareDetail(PaxFareDetailVO paxFareDetail) {
		this.paxFareDetail = paxFareDetail;
	}
	
	@XmlElement
	public PaxReferVO getPaxReference() {
		return paxReference;
	}
	public void setPaxReference(PaxReferVO paxReference) {
		this.paxReference = paxReference;
	}
	
	@XmlElement
	public PaxTaxDetailsVO getPassengerTaxDetails() {
		return passengerTaxDetails;
	}
	public void setPassengerTaxDetails(PaxTaxDetailsVO passengerTaxDetails) {
		this.passengerTaxDetails = passengerTaxDetails;
	}
	
	@XmlElement
	public List<FareVO> getFare() {
		return fare;
	}
	public void setFare(List<FareVO> fare) {
		this.fare = fare;
	}
	
	@XmlElement
	public FareDetailsVO getFareDetails() {
		return fareDetails;
	}
	public void setFareDetails(FareDetailsVO fareDetails) {
		this.fareDetails = fareDetails;
	}
}
