package com.chentiming.entity;
// Generated 2016-1-26 16:06:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "coin")
public class User implements java.io.Serializable {

	private int id;
	private String name;
	private String password;

	public User() {
	}

	public User(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
