
package com.cinchwallet.adminportal.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "USER_LOGIN")
public class UserLogin implements Serializable {

	private static final long serialVersionUID = 1L;

	public UserLogin() {
		this.status = true;
		this.createTs = new Date();
		this.updatedTs = new Date();
	}

	public UserLogin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		this.status = true;
		this.createTs = new Date();
		this.updatedTs = new Date();
	}

	@Id
	@Column(name = "UID")
	@GeneratedValue
	private Integer uid;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "USER_TYPE")
	private Integer userType;

	@Column(name = "STATUS")
	private Boolean status;

	@Column(name = "PARENT_ID")
	private Integer parentId;

	/*	
	
	 * This is one-to-one bidirectional mapping
	 * 
	 * Mapping user table with common key i.e. USER_ID (which is primary key in User table)
	 
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "USER_ID")
	private User user;
*/
	@Transient
	private Integer access;

	@Column(name = "CREATED_TS")
	private Date createTs;

	@Column(name = "UPDATED_TS")
	private Date updatedTs;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAccess() {
		return access;
	}

	public void setAccess(Integer access) {
		this.access = access;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

/*	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
*/
	
	
}
