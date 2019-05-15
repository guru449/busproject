package com.guru.dto;

public class Bus{
	private int Busid;
	private  String BusNo;
	private String route;
	private String  cname;
	private  String dname;
	private double rating;
	public int getBusid() {
		return Busid;
	}
	public void setBusid(int busid) {
		Busid = busid;
	}
	public String getBusNo() {
		return BusNo;
	}
	public void setBusNo(String busNo) {
		BusNo = busNo;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
}

