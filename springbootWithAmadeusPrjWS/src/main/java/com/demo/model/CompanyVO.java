package com.demo.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="companyId")
@XmlType(propOrder={"marketingCarrier","operatingCarrier","alliance"})
public class CompanyVO {
	
	String marketingCarrier;
	String operatingCarrier;
	String alliance;
	
	@XmlElement
	public String getMarketingCarrier() {
		return marketingCarrier;
	}
	public void setMarketingCarrier(String marketingCarrier) {
		this.marketingCarrier = marketingCarrier;
	}
	
	@XmlElement
	public String getOperatingCarrier() {
		return operatingCarrier;
	}
	public void setOperatingCarrier(String operatingCarrier) {
		this.operatingCarrier = operatingCarrier;
	}
	
	@XmlElement
	public String getAlliance() {
		return alliance;
	}
	public void setAlliance(String alliance) {
		this.alliance = alliance;
	}
	

}
