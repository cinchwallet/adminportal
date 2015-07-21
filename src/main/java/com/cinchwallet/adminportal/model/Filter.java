package com.cinchwallet.adminportal.model;


public class Filter {

	//card product search
	private String upc;
	private String name;
	private String mid;
	private String sid;
	
	public Filter(String upc, String name, String mid) {
		this.upc = upc;
		this.name = name;
		this.mid = mid;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}

}
