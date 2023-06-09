package com.eoxys.iot_dashboard_app.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "device_data_profile")
public class DeviceDataProfile {
	
	private Long device_data_profile_id;
	private Date created_at;
	private String created_by;
	private Date updated_at;
	private String updated_by;
	private String data_profile_name;
	private String fields;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getDevice_data_profile_id() {
		return device_data_profile_id;
	}
	public void setDevice_data_profile_id(Long device_data_profile_id) {
		this.device_data_profile_id = device_data_profile_id;
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
	public String getData_profile_name() {
		return data_profile_name;
	}
	public void setData_profile_name(String data_profile_name) {
		this.data_profile_name = data_profile_name;
	}
	@Column(name = "fields",columnDefinition = "LONGTEXT")
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	@Override
	public String toString() {
		return "DeviceDataProfile [device_data_profile_id=" + device_data_profile_id + ", created_at=" + created_at
				+ ", created_by=" + created_by + ", updated_at=" + updated_at + ", updated_by=" + updated_by
				+ ", data_profile_name=" + data_profile_name + ", fields=" + fields + "]";
	}

}
