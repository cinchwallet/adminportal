package com.cinchwallet.adminportal.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROMOTIONAL_OFFER")
public class PromoOffer implements Serializable{

    public PromoOffer() {
	this.createTs = new Date(System.currentTimeMillis());
	this.updatedTs = new Date(System.currentTimeMillis());
    }


    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "UID")
    @GeneratedValue
    private Integer uid;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PROMO_CODE")
    private String promoCode;

    @Column(name = "CARD_PRODUCT")
    private String cardProduct;

    @Column(name = "PROMO_RULE")
    private String promoRule;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "CREATED_TS")
    private java.util.Date createTs;

    @Column(name = "UPDATED_TS")
    private java.util.Date updatedTs;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public String getCardProduct() {
		return cardProduct;
	}

	public void setCardProduct(String cardProduct) {
		this.cardProduct = cardProduct;
	}

	public String getPromoRule() {
		return promoRule;
	}

	public void setPromoRule(String promoRule) {
		this.promoRule = promoRule;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public java.util.Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(java.util.Date createTs) {
		this.createTs = createTs;
	}

	public java.util.Date getUpdatedTs() {
		return updatedTs;
	}

	public void setUpdatedTs(java.util.Date updatedTs) {
		this.updatedTs = updatedTs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
