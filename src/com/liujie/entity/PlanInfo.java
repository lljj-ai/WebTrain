/*
 *华迪实训第八组
 */
package com.liujie.entity;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class PlanInfo {
	private int id;
	private String fatherClass;
	private String name;
	private String description;
	private boolean isValid;
	/**
	 * 
	 */
	public PlanInfo() {
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
	 * @return the fatherClass
	 */
	public String getFatherClass() {
		return fatherClass;
	}
	/**
	 * @param fatherClass the fatherClass to set
	 */
	public void setFatherClass(String fatherClass) {
		this.fatherClass = fatherClass;
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
	
	/**
	 * @return the isValid
	 */
	public boolean isValid() {
		return isValid;
	}
	/**
	 * @param isValid the isValid to set
	 */
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	@Override
	public String toString() {
		return "PlanInfo [id=" + id + ", fatherClass=" + fatherClass + ", name=" + name + ", description=" + description
				+ ", isValid=" + isValid + "]";
	}
	
}
