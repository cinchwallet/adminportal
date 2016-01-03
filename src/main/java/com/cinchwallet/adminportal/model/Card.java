package com.cinchwallet.adminportal.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cinchwallet.adminportal.constant.AppConstant;

@Entity
@Table(name = "CARD")
public class Card implements Serializable{

    public Card() {
	this.createTs = new Date(System.currentTimeMillis());
	this.updatedTs = new Date(System.currentTimeMillis());
	this.status = AppConstant.CardStatus.NEW.name();
    }


    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "UID")
    @GeneratedValue
    private Integer uid;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "CARD_PRODUCT")
    private String cardProduct;

    @Column(name = "PROXY_NUMBER")
    private String proxyNumber;

    @Column(name = "PRELOADED_AMOUNT")
    private Double preloadedAmount;

    @Column(name = "EXPIRY_DATE")
    private String expiryDate;

    @Column(name = "BALANCE")
    private Double balance;//(Select);

    @Column(name = "POINTS")
    private int points;
    
    @Column(name = "POINTS_EXPIRE_ON")
    private Date pointsExpireOn;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CREATED_TS")
    private Date createTs;

    @Column(name = "UPDATED_TS")
    private Date updatedTs;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getPreloadedAmount() {
        return preloadedAmount;
    }

    public void setPreloadedAmount(Double preloadedAmount) {
        this.preloadedAmount = preloadedAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    public String getProxyNumber() {
        return proxyNumber;
    }

    public void setProxyNumber(String proxyNumber) {
        this.proxyNumber = proxyNumber;
    }

	public String getCardProduct() {
		return cardProduct;
	}

	public void setCardProduct(String cardProduct) {
		this.cardProduct = cardProduct;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Date getPointsExpireOn() {
		return pointsExpireOn;
	}

	public void setPointsExpireOn(Date pointsExpireOn) {
		this.pointsExpireOn = pointsExpireOn;
	}

	
}
