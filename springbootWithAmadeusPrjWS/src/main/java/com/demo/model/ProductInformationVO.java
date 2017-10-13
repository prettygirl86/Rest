package com.demo.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="productInformation")
@XmlType(propOrder={"cabinProduct","fareProductDetail"})
public class ProductInformationVO {
	
	CabinPdtVO cabinProduct;
	FarePdtDetailVO fareProductDetail;
	
	@XmlElement
	public CabinPdtVO getCabinProduct() {
		return cabinProduct;
	}
	public void setCabinProduct(CabinPdtVO cabinProduct) {
		this.cabinProduct = cabinProduct;
	}
	
	@XmlElement
	public FarePdtDetailVO getFareProductDetail() {
		return fareProductDetail;
	}
	public void setFareProductDetail(FarePdtDetailVO fareProductDetail) {
		this.fareProductDetail = fareProductDetail;
	}
	
	

}
