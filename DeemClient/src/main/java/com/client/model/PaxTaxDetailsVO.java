package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="passengerTaxDetails")
public class PaxTaxDetailsVO {

	List<TaxDetailsVO> taxDetails;

	@XmlElement
	public List<TaxDetailsVO> getTaxDetails() {
		return taxDetails;
	}

	public void setTaxDetails(List<TaxDetailsVO> taxDetails) {
		this.taxDetails = taxDetails;
	}
	
}
