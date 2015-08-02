package com.cinchwallet.adminportal.model;


public class Filter {

	//card product search
	private String upc;
	private String name;
	private String mid;
	private String sid;
	
	//transaction search
	private String cardNumber;
	private String txnDate;
	private String ms;
	
	
	public Filter() {}
	
	public Filter(String upc, String name, String mid) {
		this.upc = upc;
		this.name = name;
		this.mid = mid;
	}
	public Filter(String mid, String sid, String cardNumber, String txnDate) {
		this.mid = mid;
		this.sid = mid;
		this.cardNumber = cardNumber;
		if(txnDate!=null && txnDate.length()>0)
			this.txnDate = txnDate;
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
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(String txnDate) {
		this.txnDate = txnDate;
	}

	public String getMs() {
		return ms;
	}

	public void setMs(String ms) {
		this.ms = ms;
	}
	
}
