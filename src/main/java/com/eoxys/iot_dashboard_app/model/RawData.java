package com.eoxys.iot_dashboard_app.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "raw_data")
public class RawData {
	
	private Long raw_data_id;
	private Date created_at;
	private String created_by;
	private Date updated_at;
	private String updated_by;
	private String raw_data;
	private String device_mac_id;
	private String parsed_data;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getRaw_data_id() {
		return raw_data_id;
	}
	public void setRaw_data_id(Long raw_data_id) {
		this.raw_data_id = raw_data_id;
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
	public String getRaw_data() {
		return raw_data;
	}
	public void setRaw_data(String raw_data) {
		this.raw_data = raw_data;
	}
	public String getDevice_mac_id() {
		return device_mac_id;
	}
	public void setDevice_mac_id(String device_mac_id) {
		this.device_mac_id = device_mac_id;
	}
	public String getParsed_data() {
		return parsed_data;
	}
	public void setParsed_data(String parsed_data) {
		this.parsed_data = parsed_data;
	}
	@Override
	public String toString() {
		return "RawData [raw_data_id=" + raw_data_id + ", created_at=" + created_at + ", created_by=" + created_by
				+ ", updated_at=" + updated_at + ", updated_by=" + updated_by + ", raw_data=" + raw_data
				+ ", device_mac_id=" + device_mac_id + ", parsed_data=" + parsed_data + "]";
	}

}
