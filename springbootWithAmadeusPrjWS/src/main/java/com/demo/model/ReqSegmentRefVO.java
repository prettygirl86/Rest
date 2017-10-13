package com.demo.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="requestedSegmentRef")
public class ReqSegmentRefVO {
	
	int segRef;

	@XmlElement
	public int getSegRef() {
		return segRef;
	}

	public void setSegRef(int segRef) {
		this.segRef = segRef;
	}

}
