/*
 *华迪实训第八组
 */
package com.liujie.entity;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class Student {
	private int id;
	private String name;
	private String account;
	private String password;

	/**
	 * 
	 */
	public Student() {
		super();
	}
	
	/**
	 * @param id
	 */
	public Student(int id) {
		super();
		this.id = id;
	}
	
	/**
	 * @param id
	 * @param password
	 */
	public Student(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	/**
	 * @param name
	 * @param account
	 * @param password
	 */
	public Student(String name, String account, String password) {
		super();
		this.name = name;
		this.account = account;
		this.password = password;
	}
	
	/**
	 * @param id
	 * @param name
	 * @param account
	 */
	public Student(int id, String name, String account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
	}

	/**
	 * @param id
	 * @param name
	 * @param account
	 * @param password
	 */
	public Student(int id, String name, String account, String password) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
		this.password = password;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", account=" + account + ", password=" + password + "]";
	}

}
