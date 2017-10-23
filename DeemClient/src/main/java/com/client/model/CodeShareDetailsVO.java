package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="codeShareDetails")
@XmlType(propOrder={"transportStageQualifier","company"})
public class CodeShareDetailsVO {
	
String transportStageQualifier;
String company;

@XmlElement
public String getTransportStageQualifier() {
	return transportStageQualifier;
}
public void setTransportStageQualifier(String transportStageQualifier) {
	this.transportStageQualifier = transportStageQualifier;
}

@XmlElement
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}

}
