package com.client.model;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="referencingDetail")
@XmlType(propOrder={"refQualifier","refNumber"})
public class RefDetailVO {

	String refQualifier;
	int refNumber;
	
	@XmlElement
	public String getRefQualifier() {
		return refQualifier;
	}
	public void setRefQualifier(String refQualifier) {
		this.refQualifier = refQualifier;
	}
	
	@XmlElement
	public int getRefNumber() {
		return refNumber;
	}
	public void setRefNumber(int refNumber) {
		this.refNumber = refNumber;
	}
	
}
