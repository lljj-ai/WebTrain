/*
 *华迪实训第八组
 */
package com.liujie.entity;

/**
 * 
 * @author liujie
 * @version 1.0
 */
public class DictionaryInfo {
	private int id;
	private String fatherIteam;
	private String symbol;
	private String name;
	private String value;
	private boolean isSort;
	private int valueSort;
	private String note;
	/**
	 * 
	 */
	public DictionaryInfo() {
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
	 * @return the fatherIteam
	 */
	public String getFatherIteam() {
		return fatherIteam;
	}
	/**
	 * @param fatherIteam the fatherIteam to set
	 */
	public void setFatherIteam(String fatherIteam) {
		this.fatherIteam = fatherIteam;
	}
	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}
	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
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
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the isSort
	 */
	public boolean isSort() {
		return isSort;
	}
	/**
	 * @param isSort the isSort to set
	 */
	public void setSort(boolean isSort) {
		this.isSort = isSort;
	}
	/**
	 * @return the valueSort
	 */
	public int getValueSort() {
		return valueSort;
	}
	/**
	 * @param valueSort the valueSort to set
	 */
	public void setValueSort(int valueSort) {
		this.valueSort = valueSort;
	}
	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}
	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "DictionaryInfo [id=" + id + ", fatherIteam=" + fatherIteam + ", symbol=" + symbol + ", name=" + name
				+ ", value=" + value + ", isSort=" + isSort + ", valueSort=" + valueSort + ", note=" + note + "]";
	}
	
}
