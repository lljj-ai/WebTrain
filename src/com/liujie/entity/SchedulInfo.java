/*
 *华迪实训第八组
 */
package com.liujie.entity;

import java.sql.Time;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class SchedulInfo {
	private int id;
	private Time timeUp;
	private Time timeDown;
	private String time;
	
	/**
	 * 
	 */
	public SchedulInfo() {
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
	 * @return the timeUp
	 */
	public Time getTimeUp() {
		return timeUp;
	}
	/**
	 * @param timeUp the timeUp to set
	 */
	public void setTimeUp(Time timeUp) {
		this.timeUp = timeUp;
	}
	/**
	 * @return the timeDown
	 */
	public Time getTimeDown() {
		return timeDown;
	}
	/**
	 * @param timeDown the timeDown to set
	 */
	public void setTimeDown(Time timeDown) {
		this.timeDown = timeDown;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "SchedulInfo [id=" + id + ", timeUp=" + timeUp + ", timeDown=" + timeDown + ", time=" + time + "]";
	}
	
}
