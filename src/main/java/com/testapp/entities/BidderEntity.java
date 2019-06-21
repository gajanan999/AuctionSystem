package com.testapp.entities;

public class BidderEntity {
	
	private int bidderId;
	private String name;
	private Double bidPerClick;
	private Double budget;
	
	
	
	public int getBidderId() {
		return bidderId;
	}
	public void setBidderId(int bidderId) {
		this.bidderId = bidderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBidPerClick() {
		return bidPerClick;
	}
	public void setBidPerClick(Double bidPerClick) {
		this.bidPerClick = bidPerClick;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "BidderEntity [id=" + bidderId + ", name=" + name + ", bidPerClick=" + bidPerClick + ", budget=" + budget
				+ "]";
	}
	
	

}
