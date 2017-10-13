package com.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name="fare")
public class FareVO {
	
	List<PricingMessageVO> pricingMessage;

	@XmlElement
	public List<PricingMessageVO> getPricingMessage() {
		return pricingMessage;
	}

	public void setPricingMessage(List<PricingMessageVO> pricingMessage) {
		this.pricingMessage = pricingMessage;
	}
	

}
