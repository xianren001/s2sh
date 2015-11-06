package com.joy.s2sh.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user", schema = "ssh_db")
public class User implements Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 7546840779661893507L;

	/**
	 * id
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	/**
	 * 用户名
	 */
	@Column(name = "user_name", nullable = false)
	private String userName;
	/**
	 * 用户密码
	 */
	@Column(name = "user_password", nullable = false)
	private String userPassword;

	/**
	 * 创建时间
	 */
	@Column(name = "create_time", nullable = false)
	private Date createTime;
	/**
	 * 更新时间
	 */
	@Column(name = "update_time", nullable = false)
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
