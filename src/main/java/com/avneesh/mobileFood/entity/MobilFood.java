package com.avneesh.mobileFood.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MobilFood 
{
	
	@Id
	@GeneratedValue
	private int locationid;
	private String applicant;
	private String facilityType;
	private String cnn;
	private String locationDescription;
	public int getLocationid() {
		return locationid;
	}
	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	public String getFacilityType() {
		return facilityType;
	}
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
	public String getCnn() {
		return cnn;
	}
	public void setCnn(String cnn) {
		this.cnn = cnn;
	}
	public String getLocationDescription() {
		return locationDescription;
	}
	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}
	@Override
	public String toString() {
		return "MobilFood [locationid=" + locationid + ", applicant=" + applicant + ", facilityType=" + facilityType
				+ ", cnn=" + cnn + ", locationDescription=" + locationDescription + "]";
	}
	
	
	

}
