package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="groupOfFares")
@XmlType(propOrder={"productInformation","fareCalculationCodeDetails"})
public class GrpOfFaresVO {

	ProductInformationVO productInformation;
	FareCalcCdeDetailsVO fareCalculationCodeDetails;
	
	@XmlElement
	public ProductInformationVO getProductInformation() {
		return productInformation;
	}
	public void setProductInformation(ProductInformationVO productInformation) {
		this.productInformation = productInformation;
	}
	
	@XmlElement
	public FareCalcCdeDetailsVO getFareCalculationCodeDetails() {
		return fareCalculationCodeDetails;
	}
	public void setFareCalculationCodeDetails(FareCalcCdeDetailsVO fareCalculationCodeDetails) {
		this.fareCalculationCodeDetails = fareCalculationCodeDetails;
	}
	
	
}
