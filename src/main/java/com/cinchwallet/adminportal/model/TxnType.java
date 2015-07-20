
package com.cinchwallet.adminportal.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TXN_TYPE")
public class TxnType implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "UID")
	@GeneratedValue
	private Integer uid;

	@Column(name = "TXN_NAME")
	private String txnName;

	@Column(name = "TXN_CODE")
	private String txnCode;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "CREATED_TIMESTAMP")
	private Date createTs;

	@Column(name = "UPDATED_TIMESTAMP")
	private Date updatedTs;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getTxnName() {
		return txnName;
	}

	public void setTxnName(String txnName) {
		this.txnName = txnName;
	}

	public String getTxnCode() {
		return txnCode;
	}

	public void setTxnCode(String txnCode) {
		this.txnCode = txnCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	
	
}
