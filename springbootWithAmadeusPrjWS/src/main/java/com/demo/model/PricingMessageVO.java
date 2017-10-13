package com.demo.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="pricingMessage")
public class PricingMessageVO {
	
	FreeTxtQualVO freeTextQualification;
	String description;

	public FreeTxtQualVO getFreeTextQualification() {
		return freeTextQualification;
	}

	public void setFreeTextQualification(FreeTxtQualVO freeTextQualification) {
		this.freeTextQualification = freeTextQualification;
	}
	
	

}
