package com.cinchwallet.adminportal.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User implements Serializable{

    public User(Integer userType) {
	this.createTs = new Date(System.currentTimeMillis());
	this.updatedTs = new Date(System.currentTimeMillis());
    }

    public User() {
	this.createTs = new Date(System.currentTimeMillis());
	this.updatedTs = new Date(System.currentTimeMillis());
    }


    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "UID")
    @GeneratedValue
    private Integer uid;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

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

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "STATUS")
    private Boolean status;

    @Column(name = "CREATED_TIMESTAMP")
    private Date createTs;

    @Column(name = "UPDATED_TIMESTAMP")
    private Date updatedTs;

  	/*
  	 * This is one-to-one bidirectional mapping
  	 * 
  	 * Reference of UserLogin oject, mapped by is the variable name in UserLogin Table.
  	 * Mapping has been defined in the UserLogin table.
  	 */
    @OneToOne(mappedBy="user")
  	private UserLogin userLogin;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getUpdatedTs() {
        return updatedTs;
    }

    public void setUpdatedTs(Date updatedTs) {
        this.updatedTs = updatedTs;
    }

		public UserLogin getUserLogin() {
			return userLogin;
		}

		public void setUserLogin(UserLogin userLogin) {
			this.userLogin = userLogin;
		}


}
