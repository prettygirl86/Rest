package com.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="paxFareDetail")
@XmlType(propOrder={"paxFareNum","totalFareAmount","totalTaxAmount","codeShareDetails","monetaryDetails","pricingTicketing"})
public class PaxFareDetailVO {

	int paxFareNum;
	double totalFareAmount;
	double totalTaxAmount;
	CodeShareDetailsVO codeShareDetails;
	List<MonetaryDetailVO> monetaryDetails;
	PricingTktVO pricingTicketing;
	
	@XmlElement
	public int getPaxFareNum() {
		return paxFareNum;
	}
	public void setPaxFareNum(int paxFareNum) {
		this.paxFareNum = paxFareNum;
	}
	
	@XmlElement
	public double getTotalFareAmount() {
		return totalFareAmount;
	}
	public void setTotalFareAmount(double totalFareAmount) {
		this.totalFareAmount = totalFareAmount;
	}
	
	@XmlElement
	public double getTotalTaxAmount() {
		return totalTaxAmount;
	}
	public void setTotalTaxAmount(double totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}
	
	@XmlElement
	public CodeShareDetailsVO getCodeShareDetails() {
		return codeShareDetails;
	}
	
	public void setCodeShareDetails(CodeShareDetailsVO codeShareDetails) {
		this.codeShareDetails = codeShareDetails;
	}
	
	@XmlElement
	public List<MonetaryDetailVO> getMonetaryDetails() {
		return monetaryDetails;
	}
	public void setMonetaryDetails(List<MonetaryDetailVO> monetaryDetails) {
		this.monetaryDetails = monetaryDetails;
	}
	
	@XmlElement
	public PricingTktVO getPricingTicketing() {
		return pricingTicketing;
	}
	
	//@XmlElement
	public void setPricingTicketing(PricingTktVO pricingTicketing) {
		this.pricingTicketing = pricingTicketing;
	}
	
}
