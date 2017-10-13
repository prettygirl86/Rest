package com.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="recPriceInfo")
public class RecPriceInfoVO {
	
	List <MonetaryDetailVO> monetaryDetail;
	
	@XmlElement
	public List<MonetaryDetailVO> getMonetaryDetail() {
		return monetaryDetail;
	}

	public void setMonetaryDetail(List<MonetaryDetailVO> monetaryDetail) {
		this.monetaryDetail = monetaryDetail;
	}

	

}
