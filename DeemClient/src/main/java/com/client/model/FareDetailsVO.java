package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="fareDetails")
@XmlType(propOrder={"segmentRef","groupOfFares","majCabin"})
public class FareDetailsVO {
	
	SegmentRefVO segmentRef;
	GrpOfFaresVO groupOfFares;
	MajCabinVO majCabin;
	
	
	@XmlElement
	public MajCabinVO getMajCabin() {
		return majCabin;
	}

	public void setMajCabin(MajCabinVO majCabin) {
		this.majCabin = majCabin;
	}

	@XmlElement
	public GrpOfFaresVO getGroupOfFares() {
		return groupOfFares;
	}

	public void setGroupOfFares(GrpOfFaresVO groupOfFares) {
		this.groupOfFares = groupOfFares;
	}

	@XmlElement
	public SegmentRefVO getSegmentRef() {
		return segmentRef;
	}

	public void setSegmentRef(SegmentRefVO segmentRef) {
		this.segmentRef = segmentRef;
	}
	

}
