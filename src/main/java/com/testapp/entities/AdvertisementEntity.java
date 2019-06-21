package com.testapp.entities;

import java.io.Serializable;

public class AdvertisementEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String title;
	private String textDescription;
	private String hyperlink;
	private int bidderId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTextDescription() {
		return textDescription;
	}
	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}
	public String getHyperlink() {
		return hyperlink;
	}
	public void setHyperlink(String hyperlink) {
		this.hyperlink = hyperlink;
	}
	public int getBidderId() {
		return bidderId;
	}
	public void setBidderId(int bidderId) {
		this.bidderId = bidderId;
	}
	@Override
	public String toString() {
		return "AdvertisementEntity [id=" + id + ", title=" + title + ", textDescription=" + textDescription
				+ ", hyperlink=" + hyperlink + ", bidderId=" + bidderId + "]";
	}
	
	
	
}
