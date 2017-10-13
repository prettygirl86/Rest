package com.demo.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="flightInformation")
@XmlType(propOrder={"productDateTime","location","companyId","flightOrtrainNumber"})
public class FlightInfoVO {
	
	ProductDateTimeVO productDateTime;
	List <LocationVO> location;
	CompanyVO companyId;
	String flightOrtrainNumber;
	
	public FlightInfoVO() {
		super();
		this.productDateTime = productDateTime;
		this.location = location;
		this.companyId = companyId;
		this.flightOrtrainNumber = flightOrtrainNumber;
	}
	
	public FlightInfoVO(ProductDateTimeVO productDateTime, List<LocationVO> location, CompanyVO companyId,
			String flightOrtrainNumber) {
		super();
		this.productDateTime = productDateTime;
		this.location = location;
		this.companyId = companyId;
		this.flightOrtrainNumber = flightOrtrainNumber;
	}
	@XmlElement
	public ProductDateTimeVO getProductDateTime() {
		return productDateTime;
	}
	public void setProductDateTime(ProductDateTimeVO productDateTime) {
		this.productDateTime = productDateTime;
	}
	
	@XmlElement
	public List<LocationVO> getLocation() {
		return location;
	}
	public void setLocation(List <LocationVO> location) {
		this.location = location;
	}
	
	@XmlElement
	public CompanyVO getCompanyId() {
		return companyId;
	}
	public void setCompanyId(CompanyVO companyId) {
		this.companyId = companyId;
	}
	
	@XmlElement
	public String getFlightOrtrainNumber() {
		return flightOrtrainNumber;
	}
	public void setFlightOrtrainNumber(String flightOrtrainNumber) {
		this.flightOrtrainNumber = flightOrtrainNumber;
	}
	

}
