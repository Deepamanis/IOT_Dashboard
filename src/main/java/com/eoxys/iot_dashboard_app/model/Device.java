package com.eoxys.iot_dashboard_app.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_device")
public class Device {
	
	private Long device_id;
	private Date created_at;
	private String created_by;
	private Date updated_at;
	private String updated_by;
	private String device_mac_id;
	private String device_name;
	private String device_category;
	private Organization organization_name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getDevice_id() {
		return device_id;
	}
	public void setDevice_id(Long device_id) {
		this.device_id = device_id;
	}
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
	public String getDevice_mac_id() {
		return device_mac_id;
	}
	public void setDevice_mac_id(String device_mac_id) {
		this.device_mac_id = device_mac_id;
	}
	public String getDevice_name() {
		return device_name;
	}
	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}
	@Column(name = "device_category",columnDefinition = "LONGTEXT")
	public String getDevice_category() {
		return device_category;
	}
	public void setDevice_category(String device_category) {
		this.device_category = device_category;
	}
	
	@JoinColumn(name = "organization_name")
	@OneToOne
	public Organization getOrganization_name() {
		return organization_name;
	}
	public void setOrganization_name(Organization organization_name) {
		this.organization_name = organization_name;
	}
	@Override
	public String toString() {
		return "Device [device_id=" + device_id + ", created_at=" + created_at + ", created_by=" + created_by
				+ ", updated_at=" + updated_at + ", updated_by=" + updated_by + ", device_mac_id=" + device_mac_id
				+ ", device_name=" + device_name + ", device_category=" + device_category + ", organization_name="
				+ organization_name + "]";
	}

	

}
