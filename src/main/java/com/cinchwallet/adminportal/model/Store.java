
package com.cinchwallet.adminportal.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@javax.persistence.Entity
@Table(name = "STORE")
public class Store implements Serializable {

	private static final long serialVersionUID = 1L;

	public Store() {
		this.createTs = new Date(System.currentTimeMillis());
		this.updatedTs = new Date(System.currentTimeMillis());
	}

	@Id
	@Column(name = "UID")
	@GeneratedValue
	private Integer uid;

	@Column(name = "STORE_ID")
	private Long storeId;

	@Column(name = "MERCHANT_ID")
	private int merchantId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "CITY")
	private String city;//(Select);

	@Column(name = "PIN")
	private String pin;

	@Column(name = "STATE")
	private String state;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "PHONE")
	private String phone;

	@Column(name = "MOBILE")
	private String mobile;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "WEBSITE")
	private String website;

	@Column(name = "STATUS")
	private Boolean status;

	@Column(name = "CREATED_TIMESTAMP")
	private Date createTs;

	@Column(name = "UPDATED_TIMESTAMP")
	private Date updatedTs;
	
	@Transient
	private ContactDetail contactDetail;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getUpdatedTs() {
		return updatedTs;
	}

	public void setUpdatedTs(Date updatedTs) {
		this.updatedTs = updatedTs;
	}

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public ContactDetail getContactDetail() {
		return contactDetail;
	}

	public void setContactDetail(ContactDetail contactDetail) {
		this.contactDetail = contactDetail;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	
}
