package com.eoxys.iot_dashboard_app.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_email_config")
public class NotificationEmailConfig {
	
	private Long email_config_id;
	private Date created_at;
	private String created_by;
	private Date updated_at;
	private String updated_by;
	private String content_name;
	private String email_content;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getEmail_config_id() {
		return email_config_id;
	}
	public void setEmail_config_id(Long email_config_id) {
		this.email_config_id = email_config_id;
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
	public String getEmail_content() {
		return email_content;
	}
	public void setEmail_content(String email_content) {
		this.email_content = email_content;
	}
	@Override
	public String toString() {
		return "EmailConfig [email_config_id=" + email_config_id + ", created_at=" + created_at + ", created_by="
				+ created_by + ", updated_at=" + updated_at + ", updated_by=" + updated_by + ", content_name="
				+ content_name + ", email_content=" + email_content + "]";
	}

}
