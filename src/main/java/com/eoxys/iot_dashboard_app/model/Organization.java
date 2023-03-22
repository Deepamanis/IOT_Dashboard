package com.eoxys.iot_dashboard_app.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "organization")
public class Organization {
	
	private Long organization_id;
	private Date created_at;
	private String created_by;
	private Date updated_at;
	private String updated_by;
	private String organization_name;
	private String address;
	private List<String> contact_person = new ArrayList<String>();
	private List<String> notification_profile = new ArrayList<String>();
	private String organization_logo;
	private List<String> additional_contacts = new ArrayList<String>();
	private OrganizationProfile organization_profile;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getOrganization_id() {
		return organization_id;
	}
	public void setOrganization_id(Long organization_id) {
		this.organization_id = organization_id;
	}
	
	@CreationTimestamp
	@Column(name = "created_at",nullable = false,updatable = false)
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	
	@UpdateTimestamp
	@Column(name = "updated_at")
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public String getOrganization_name() {
		return organization_name;
	}
	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name = "organization_logo",columnDefinition = "LONGTEXT")
	public String getOrganization_logo() {
		return organization_logo;
	}
	public void setOrganization_logo(String organization_logo) {
		this.organization_logo = organization_logo;
	}
	@JoinColumn(name = "organization_profile")
	@OneToOne
	public OrganizationProfile getOrganization_profile() {
		return organization_profile;
	}
	public void setOrganization_profile(OrganizationProfile organization_profile) {
		this.organization_profile = organization_profile;
	}
	public List<String> getContact_person() {
		return contact_person;
	}
	public void setContact_person(List<String> contact_person) {
		this.contact_person = contact_person;
	}
	public List<String> getNotification_profile() {
		return notification_profile;
	}
	public void setNotification_profile(List<String> notification_profile) {
		this.notification_profile = notification_profile;
	}
	public List<String> getAdditional_contacts() {
		return additional_contacts;
	}
	public void setAdditional_contacts(List<String> additional_contacts) {
		this.additional_contacts = additional_contacts;
	}
	@Override
	public String toString() {
		return "Organization [organization_id=" + organization_id + ", created_at=" + created_at + ", created_by="
				+ created_by + ", updated_at=" + updated_at + ", updated_by=" + updated_by + ", organization_name="
				+ organization_name + ", address=" + address + ", contact_person=" + contact_person
				+ ", notification_profile=" + notification_profile + ", organization_logo=" + organization_logo
				+ ", additional_contacts=" + additional_contacts + ", organization_profile=" + organization_profile
				+ "]";
	}
	

}
