/*
 *华迪实训第八组
 */
package com.liujie.entity;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class ProfessionalInfo {
	private int id;
	private String name;
	private String description;
	/**
	 * 
	 */
	public ProfessionalInfo() {
		super();
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ProfessionalInfo [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
}
