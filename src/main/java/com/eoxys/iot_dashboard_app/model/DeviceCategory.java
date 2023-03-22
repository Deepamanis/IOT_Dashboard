package com.eoxys.iot_dashboard_app.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "device_category")
public class DeviceCategory {
	
	private Long device_category_id;
	private Date created_at;
	private String created_by;
	private Date updated_at;
	private String updated_by;
	private String category_name;
	private String device_image;
	private String device_profile;
	private String device_data_profile;
	private String global_alarm_rule;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getDevice_category_id() {
		return device_category_id;
	}
	public void setDevice_category_id(Long device_category_id) {
		this.device_category_id = device_category_id;
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
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	@Column(name = "device_image",columnDefinition = "LONGTEXT")
	public String getDevice_image() {
		return device_image;
	}
	public void setDevice_image(String device_image) {
		this.device_image = device_image;
	}
	@Column(name = "device_profile",columnDefinition = "LONGTEXT")
	public String getDevice_profile() {
		return device_profile;
	}
	public void setDevice_profile(String device_profile) {
		this.device_profile = device_profile;
	}
	@Column(name = "device_data_profile",columnDefinition = "LONGTEXT")
	public String getDevice_data_profile() {
		return device_data_profile;
	}
	public void setDevice_data_profile(String device_data_profile) {
		this.device_data_profile = device_data_profile;
	}
	@Column(name = "global_alarm_rule",columnDefinition = "LONGTEXT")
	public String getGlobal_alarm_rule() {
		return global_alarm_rule;
	}
	public void setGlobal_alarm_rule(String global_alarm_rule) {
		this.global_alarm_rule = global_alarm_rule;
	}
	@Override
	public String toString() {
		return "DeviceCategory [device_category_id=" + device_category_id + ", created_at=" + created_at
				+ ", created_by=" + created_by + ", updated_at=" + updated_at + ", updated_by=" + updated_by
				+ ", category_name=" + category_name + ", device_image=" + device_image + ", device_profile="
				+ device_profile + ", device_data_profile=" + device_data_profile + ", global_alarm_rule="
				+ global_alarm_rule + "]";
	}
	
	
	

}
