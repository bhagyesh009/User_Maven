package com.bitwise.dto;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private long mobNo;

	public int getId() {
		return id;
	}

	public User() {
		super();
	}

	public User(int id, String name, long mobNo) {
		super();
		this.id = id;
		this.name = name;
		this.mobNo = mobNo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobNo=" + mobNo + "]";
	}

}
