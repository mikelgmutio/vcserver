package com.phoenixcontact.vcserver.beans;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class VersionInformation {

	public VersionInformation() {
		super();
	}
	public VersionInformation(String version, String productName, String changedFeaturesDescription, Date releaseDate) {
		super();
		this.version = version;
		ProductName = productName;
		ChangedFeaturesDescription = changedFeaturesDescription;
		this.releaseDate = releaseDate;
	}
	private @Id @GeneratedValue Long id;

	private String version;
	private String ProductName;
	private String ChangedFeaturesDescription;
	private Date releaseDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getChangedFeaturesDescription() {
		return ChangedFeaturesDescription;
	}
	public void setChangedFeaturesDescription(String changedFeaturesDescription) {
		ChangedFeaturesDescription = changedFeaturesDescription;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}	
	
}
