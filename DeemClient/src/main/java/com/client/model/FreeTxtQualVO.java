package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name="freeTextQualification")
@XmlType(propOrder={"textSubjectQualifier","informationType"})
public class FreeTxtQualVO {

	String textSubjectQualifier;
	String informationType;
	
	@XmlElement
	public String getTextSubjectQualifier() {
		return textSubjectQualifier;
	}
	public void setTextSubjectQualifier(String textSubjectQualifier) {
		this.textSubjectQualifier = textSubjectQualifier;
	}
	
	@XmlElement
	public String getInformationType() {
		return informationType;
	}
	public void setInformationType(String informationType) {
		this.informationType = informationType;
	}
	
}
