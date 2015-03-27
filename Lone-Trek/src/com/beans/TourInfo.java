package com.beans;

import java.sql.Date;

public class TourInfo {

	private String name;
	private String origin;
	private String destination;
	private Date date;
	private String focusOfTour;
	private String allowedPeople;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFocusOfTour() {
		return focusOfTour;
	}
	public void setFocusOfTour(String focusOfTour) {
		this.focusOfTour = focusOfTour;
	}
	public String getAllowedPeople() {
		return allowedPeople;
	}
	public void setAllowedPeople(String allowedPeople) {
		this.allowedPeople = allowedPeople;
	}
	
	
}
