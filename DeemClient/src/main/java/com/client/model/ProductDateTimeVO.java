package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="productDateTime")
@XmlType(propOrder={"dateOfDeparture","timeOfDeparture","dateOfArrival","timeOfArrival"})
public class ProductDateTimeVO {

	String dateOfDeparture;
	String timeOfDeparture;
	String dateOfArrival;
	String timeOfArrival;
	
	public ProductDateTimeVO() {
		super();
		this.dateOfDeparture = dateOfDeparture;
		this.timeOfDeparture = timeOfDeparture;
		this.dateOfArrival = dateOfArrival;
		this.timeOfArrival = timeOfArrival;
	}
	
	public ProductDateTimeVO(String dateOfDeparture, String timeOfDeparture, String dateOfArrival,
			String timeOfArrival) {
		super();
		this.dateOfDeparture = dateOfDeparture;
		this.timeOfDeparture = timeOfDeparture;
		this.dateOfArrival = dateOfArrival;
		this.timeOfArrival = timeOfArrival;
	}
	@XmlElement
	public String getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(String dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	
	@XmlElement
	public String getTimeOfDeparture() {
		return timeOfDeparture;
	}
	public void setTimeOfDeparture(String timeOfDeparture) {
		this.timeOfDeparture = timeOfDeparture;
	}
	
	@XmlElement
	public String getDateOfArrival() {
		return dateOfArrival;
	}
	public void setDateOfArrival(String dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}
	
	@XmlElement
	public String getTimeOfArrival() {
		return timeOfArrival;
	}
	public void setTimeOfArrival(String timeOfArrival) {
		this.timeOfArrival = timeOfArrival;
	}
	
	
}
