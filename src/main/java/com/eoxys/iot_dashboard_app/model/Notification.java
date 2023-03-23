package com.eoxys.iot_dashboard_app.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_notification")
public class Notification {
	
	
	private Long notification_id;
	private Date created_at;
	private String created_by;
	private Date updated_at;
	private String updated_by;
	private String device_mac_id;
	private String notification_message;
	private Date date_time;
	private String notification_receiver;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getNotification_id() {
		return notification_id;
	}
	public void setNotification_id(Long notification_id) {
		this.notification_id = notification_id;
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
	public String getNotification_message() {
		return notification_message;
	}
	public void setNotification_message(String notification_message) {
		this.notification_message = notification_message;
	}
	public Date getDate_time() {
		return date_time;
	}
	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}
	public String getNotification_receiver() {
		return notification_receiver;
	}
	public void setNotification_receiver(String notification_receiver) {
		this.notification_receiver = notification_receiver;
	}
	@Override
	public String toString() {
		return "Notification [notification_id=" + notification_id + ", created_at=" + created_at + ", created_by="
				+ created_by + ", updated_at=" + updated_at + ", updated_by=" + updated_by + ", device_mac_id="
				+ device_mac_id + ", notification_message=" + notification_message + ", date_time=" + date_time
				+ ", notification_receiver=" + notification_receiver + "]";
	}

}
