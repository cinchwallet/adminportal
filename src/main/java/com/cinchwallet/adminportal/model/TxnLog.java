package com.cinchwallet.adminportal.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "OLTP_TXN_LOG")
public class TxnLog implements Serializable{

		private static final long serialVersionUID = 1L;

		@Id
    @Column(name = "OLTP_TXN_LOG_ID")
    @GeneratedValue
    private Integer txnLogId;

    @Column(name = "LEG")
    private String leg;

    @Column(name = "PAN")
    private String pan;

    @Column(name = "PAN_HINT")
    private String panHint;

    @Column(name = "TXN_AMOUNT")
    private Double txnAmount;

    @Column(name = "DT_TRANSMISSION")
    private Timestamp dtTransmission;

    @Column(name = "STAN")
    private String stan;

    @Column(name = "DT_TRANSACTION")
    private Timestamp dtTransaction;

    @Column(name = "APPROVAL_CD")
    private String approvalCode;

    @Column(name = "REASON_CD")
    private String reasonCode;

    @Column(name = "RESULT_CD")
    private String resultCode;

    @Column(name = "TID")
    private String tid;

    @Column(name = "SID")
    private String sid;

    @Column(name = "MID")
    private String mid;

    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public Timestamp getDtTransaction() {
        return dtTransaction;
    }

    public void setDtTransaction(Timestamp dtTransaction) {
        this.dtTransaction = dtTransaction;
    }

    public Timestamp getDtTransmission() {
        return dtTransmission;
    }

    public void setDtTransmission(Timestamp dtTransmission) {
        this.dtTransmission = dtTransmission;
    }


    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }


    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Double getTxnAmount() {
        return txnAmount;
    }

    public void setTxnAmount(Double txnAmount) {
        this.txnAmount = txnAmount;
    }

    public Integer getTxnLogId() {
        return txnLogId;
    }

    public void setTxnLogId(Integer txnLogId) {
        this.txnLogId = txnLogId;
    }

    public String getPanHint() {
        return panHint;
    }

    public void setPanHint(String panHint) {
        this.panHint = panHint;
    }


}
