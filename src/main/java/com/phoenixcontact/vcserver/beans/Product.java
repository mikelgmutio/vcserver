package com.phoenixcontact.vcserver.beans;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Product {

	public Product() {
		super();
	}
	public Product(String name, String number, String description, String lastVersion) {
		super();
		this.name = name;
		this.number = number;
		this.description = description;
		this.lastVersion = lastVersion;
	}
	private @Id @GeneratedValue Long id;

	private String name;
	private String number;
	private String description;
	private String lastVersion;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLastVersion() {
		return lastVersion;
	}
	public void setLastVersion(String lastVersion) {
		this.lastVersion = lastVersion;
	}
	
}
