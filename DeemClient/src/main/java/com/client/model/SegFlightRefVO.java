package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="segmentFlightRef")
public class SegFlightRefVO {
	
	RefDetailVO referencingDetail;

	@XmlElement
	public RefDetailVO getReferencingDetail() {
		return referencingDetail;
	}

	public void setReferencingDetail(RefDetailVO referencingDetail) {
		this.referencingDetail = referencingDetail;
	}

}
