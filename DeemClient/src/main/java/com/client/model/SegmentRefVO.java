package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="segmentRef")
public class SegmentRefVO {

	int segRef;

	@XmlElement
	public int getSegRef() {
		return segRef;
	}

	public void setSegRef(int segRef) {
		this.segRef = segRef;
	}
	
	
}
