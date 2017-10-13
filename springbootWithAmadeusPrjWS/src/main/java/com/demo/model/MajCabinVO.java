package com.demo.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="majCabin")
public class MajCabinVO {
	
	BookClsDetailsVO bookingClassDetails;

	@XmlElement
	public BookClsDetailsVO getBookingClassDetails() {
		return bookingClassDetails;
	}

	public void setBookingClassDetails(BookClsDetailsVO bookingClassDetails) {
		this.bookingClassDetails = bookingClassDetails;
	}
	

}
