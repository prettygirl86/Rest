package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="fareCalculationCodeDetails")
@XmlType(propOrder={"qualifier","amount"})
public class FareCalcCdeDetailsVO {
	
	String qualifier;
	double amount;
	
	@XmlElement
	public String getQualifier() {
		return qualifier;
	}
	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}
	
	@XmlElement
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
