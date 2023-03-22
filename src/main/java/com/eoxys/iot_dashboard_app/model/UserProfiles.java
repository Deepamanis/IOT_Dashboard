package com.eoxys.iot_dashboard_app.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_profiles")
public class UserProfiles {
	
	private Long user_profile_id;
	private Date created_at;
	private String created_by;
	private Date updated_at;
	private String updated_by;
	private String user_profile_name;
	private String feilds;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getUser_profile_id() {
		return user_profile_id;
	}
	public void setUser_profile_id(Long user_profile_id) {
		this.user_profile_id = user_profile_id;
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
	public String getUser_profile_name() {
		return user_profile_name;
	}
	public void setUser_profile_name(String user_profile_name) {
		this.user_profile_name = user_profile_name;
	}
	public String getFeilds() {
		return feilds;
	}
	public void setFeilds(String feilds) {
		this.feilds = feilds;
	}
	
}
