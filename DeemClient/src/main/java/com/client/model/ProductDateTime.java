package com.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "productDateTime")
public class ProductDateTime {

	protected String dateofDeparture;
	protected String timeofDeparture;
	protected String dateofArrival;
	protected String timeofArrival;
	
	public ProductDateTime() {
		
	}
	public ProductDateTime(String dateofDeparture, String timeofDeparture, String dateofArrival, String timeofArrival) {
		super();
		this.dateofDeparture = dateofDeparture;
		this.timeofDeparture = timeofDeparture;
		this.dateofArrival = dateofArrival;
		this.timeofArrival = timeofArrival;
	}
	
	public String getDateofDeparture() {
		return dateofDeparture;
	}
	public void setDateofDeparture(String dateofDeparture) {
		this.dateofDeparture = dateofDeparture;
	}
	public String getTimeofDeparture() {
		return timeofDeparture;
	}
	public void setTimeofDeparture(String timeofDeparture) {
		this.timeofDeparture = timeofDeparture;
	}
	public String getDateofArrival() {
		return dateofArrival;
	}
	public void setDateofArrival(String dateofArrival) {
		this.dateofArrival = dateofArrival;
	}
	public String getTimeofArrival() {
		return timeofArrival;
	}
	public void setTimeofArrival(String timeofArrival) {
		this.timeofArrival = timeofArrival;
	}
	
	
	
}
