package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="recommendations")
@XmlType(propOrder={"itemNumber","recPriceInfo","segmentFlightRef","paxFareProduct"})
public class RecommendationVO {
	
	ItemNumberVO itemNumber;
	RecPriceInfoVO recPriceInfo;
	List<SegFlightRefVO> segmentFlightRef;
	PaxFareProduct paxFareProduct;
	
	@XmlElement
	public ItemNumberVO getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(ItemNumberVO itemNumber) {
		this.itemNumber = itemNumber;
	}
	
	@XmlElement
	public RecPriceInfoVO getRecPriceInfo() {
		return recPriceInfo;
	}
	public void setRecPriceInfo(RecPriceInfoVO recPriceInfo) {
		this.recPriceInfo = recPriceInfo;
	}
	
	@XmlElement
	public List<SegFlightRefVO> getSegmentFlightRef() {
		return segmentFlightRef;
	}
	public void setSegmentFlightRef(List<SegFlightRefVO> segmentFlightRef) {
		this.segmentFlightRef = segmentFlightRef;
	}
	
	@XmlElement
	public PaxFareProduct getPaxFareProduct() {
		return paxFareProduct;
	}
	public void setPaxFareProduct(PaxFareProduct paxFareProduct) {
		this.paxFareProduct = paxFareProduct;
	}
	

}
