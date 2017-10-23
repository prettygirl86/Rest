package com.client.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="itemNumber")
public class ItemNumberVO {

	ItemNumIdVO itemNumberId;

	@XmlElement
	public ItemNumIdVO getItemNumberId() {
		return itemNumberId;
	}

	public void setItemNumberId(ItemNumIdVO itemNumberId) {
		this.itemNumberId = itemNumberId;
	}
}
