package com.eoxys.iot_dashboard_app.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sms_config")
public class NotificationSmsConfig {

	private Long sms_config_id;
	private Date created_at;
	private String created_by;
	private Date updated_at;
	private String updated_by;
	private String content_name;
	private String sms_content;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getSms_config_id() {
		return sms_config_id;
	}
	public void setSms_config_id(Long sms_config_id) {
		this.sms_config_id = sms_config_id;
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
	public String getContent_name() {
		return content_name;
	}
	public void setContent_name(String content_name) {
		this.content_name = content_name;
	}
	public String getSms_content() {
		return sms_content;
	}
	public void setSms_content(String sms_content) {
		this.sms_content = sms_content;
	}
	@Override
	public String toString() {
		return "SmsConfig [sms_config_id=" + sms_config_id + ", created_at=" + created_at + ", created_by=" + created_by
				+ ", updated_at=" + updated_at + ", updated_by=" + updated_by + ", content_name=" + content_name
				+ ", sms_content=" + sms_content + "]";
	}
	
}
