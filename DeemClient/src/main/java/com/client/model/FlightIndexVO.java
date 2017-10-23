package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="flightindex")
@XmlType(propOrder= {"requestedSegmentRef","groupOfFlights"})
public class FlightIndexVO {
	
	ReqSegmentRefVO requestedSegmentRef;
	List <GroupOfFlightsVO> groupOfFlights;
	
	@XmlElement
	public List<GroupOfFlightsVO> getGroupOfFlights() {
		return groupOfFlights;
	}

	public void setGroupOfFlights(List<GroupOfFlightsVO> groupOfFlights) {
		this.groupOfFlights = groupOfFlights;
	}

	@XmlElement
	public ReqSegmentRefVO getRequestedSegmentRef() {
		return requestedSegmentRef;
	}

	public void setRequestedSegmentRef(ReqSegmentRefVO requestedSegmentRef) {
		this.requestedSegmentRef = requestedSegmentRef;
	}

	

	

}
