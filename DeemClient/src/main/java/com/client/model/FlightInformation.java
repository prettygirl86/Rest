package com.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement(name = "flightInformation")
public class FlightInformation {
	
	private ProductDateTime productDateTime ;
	private String locationFrom;
	private String locationTo;
	
	public FlightInformation() {
		
	}
	public FlightInformation(ProductDateTime productDateTime, String locationFrom, String locationTo) {
		super();
		this.productDateTime = productDateTime;
		this.locationFrom = locationFrom;
		this.locationTo = locationTo;
	}
	public ProductDateTime getProductDateTime() {
		return productDateTime;
	}
	public void setProductDateTime(ProductDateTime productDateTime) {
		this.productDateTime = productDateTime;
	}
	public String getLocationFrom() {
		return locationFrom;
	}
	public void setLocationFrom(String locationFrom) {
		this.locationFrom = locationFrom;
	}
	public String getLocationTo() {
		return locationTo;
	}
	public void setLocationTo(String locationTo) {
		this.locationTo = locationTo;
	}
	
	

	
}
