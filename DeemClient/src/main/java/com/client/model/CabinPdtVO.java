package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="cabinProduct")
@XmlType(propOrder={"rbd","cabin","avlStatus"})
public class CabinPdtVO {

	String rbd;
	String cabin;
	int avlStatus;
	
	@XmlElement
	public String getRbd() {
		return rbd;
	}
	public void setRbd(String rbd) {
		this.rbd = rbd;
	}
	
	@XmlElement
	public String getCabin() {
		return cabin;
	}
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
	
	@XmlElement
	public int getAvlStatus() {
		return avlStatus;
	}
	public void setAvlStatus(int avlStatus) {
		this.avlStatus = avlStatus;
	}
	
}
