package com.eoxys.iot_dashboard_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_users")
public class Users {

	private Long user_id;
	private String username;
	private String email;
	private String phone_number;
	private UserProfiles additional_feilds;
	private Organization organization;
	private Boolean isprimary_user;
	private Boolean issecondary_user;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	@JoinColumn(name = "additional_feilds")
	@OneToOne
	public UserProfiles getAdditional_feilds() {
		return additional_feilds;
	}
	public void setAdditional_feilds(UserProfiles additional_feilds) {
		this.additional_feilds = additional_feilds;
	}
	@JoinColumn(name = "organization")
	@OneToOne
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	public Boolean getIsprimary_user() {
		return isprimary_user;
	}
	public void setIsprimary_user(Boolean isprimary_user) {
		this.isprimary_user = isprimary_user;
	}
	public Boolean getIssecondary_user() {
		return issecondary_user;
	}
	public void setIssecondary_user(Boolean issecondary_user) {
		this.issecondary_user = issecondary_user;
	}
	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", username=" + username + ", email=" + email + ", phone_number="
				+ phone_number + ", additional_feilds=" + additional_feilds + ", organization=" + organization
				+ ", isprimary_user=" + isprimary_user + ", issecondary_user=" + issecondary_user + "]";
	}
	
	
}
