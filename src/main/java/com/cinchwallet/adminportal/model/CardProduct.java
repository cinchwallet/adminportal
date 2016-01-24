
package com.cinchwallet.adminportal.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CARD_PRODUCT")
public class CardProduct implements Serializable {

	public CardProduct() {
		this.createTs = new Date(System.currentTimeMillis());
		this.updatedTs = new Date(System.currentTimeMillis());
		this.status = true;
	}

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "UID")
	@GeneratedValue
	private Integer uid;

	@Column(name = "UPC")
	private String upc;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "CURRENCY")
	private String currency;

	@Column(name = "ISSUING_MERCHANT")
	private String issuingMerchant;//(Select);

	@Column(name = "POINT_PROGRAM")
	private Boolean pointProgram;

	@Column(name = "STATUS")
	private Boolean status;

	@Column(name = "CARD_TYPE")
	private String cardType;
	
	@Column(name = "LOYALTY_TYPE")
	private String loyaltyType;
	
	@Column(name = "POINTS_PER_TXN")
	private Integer pointsPerTxn;

	@Column(name = "EARN_POINT_RULE")
	private String earnPointRule;

	@Column(name = "BURN_POINT_RULE")
	private String burnPointRule;

	@Column(name = "RELOAD_LIMIT")
	private Double reloadLimit;

	@Column(name = "REDEEM_LIMIT")
	private Double redeemLimit;

	@Column(name = "ONLINE_PIN_REQUIRED")
	private Boolean onlinePinRequired;

	@Column(name = "SUPPORTED_TXN")
	private String supportedTxn;

	@Column(name = "CREATED_TS")
	private Date createTs;

	@Column(name = "UPDATED_TS")
	private Date updatedTs;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIssuingMerchant() {
		return issuingMerchant;
	}

	public void setIssuingMerchant(String issuingMerchant) {
		this.issuingMerchant = issuingMerchant;
	}

	public Boolean getPointProgram() {
		return pointProgram;
	}

	public void setPointProgram(Boolean pointProgram) {
		this.pointProgram = pointProgram;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getOnlinePinRequired() {
		return onlinePinRequired;
	}

	public void setOnlinePinRequired(Boolean onlinePinRequired) {
		this.onlinePinRequired = onlinePinRequired;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getSupportedTxn() {
		return supportedTxn;
	}

	public void setSupportedTxn(String supportedTxn) {
		this.supportedTxn = supportedTxn;
	}

	public Double getReloadLimit() {
		return reloadLimit;
	}

	public void setReloadLimit(Double reloadLimit) {
		this.reloadLimit = reloadLimit;
	}

	public Double getRedeemLimit() {
		return redeemLimit;
	}

	public void setRedeemLimit(Double redeemLimit) {
		this.redeemLimit = redeemLimit;
	}

	public Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}

	public Date getUpdatedTs() {
		return updatedTs;
	}

	public void setUpdatedTs(Date updatedTs) {
		this.updatedTs = updatedTs;
	}

	public String getEarnPointRule() {
		return earnPointRule;
	}

	public void setEarnPointRule(String earnPointRule) {
		this.earnPointRule = earnPointRule;
	}

	public String getBurnPointRule() {
		return burnPointRule;
	}

	public void setBurnPointRule(String burnPointRule) {
		this.burnPointRule = burnPointRule;
	}

	public String getLoyaltyType() {
		return loyaltyType;
	}

	public void setLoyaltyType(String loyaltyType) {
		this.loyaltyType = loyaltyType;
	}

	public Integer getPointsPerTxn() {
		return pointsPerTxn;
	}

	public void setPointsPerTxn(Integer pointsPerTxn) {
		this.pointsPerTxn = pointsPerTxn;
	}

	
}
