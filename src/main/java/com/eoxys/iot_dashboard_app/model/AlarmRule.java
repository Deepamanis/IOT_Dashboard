package com.eoxys.iot_dashboard_app.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "global_alarm_rule")
public class AlarmRule {
	
	
	private Long global_alarm_id;
	private Date created_at;
	private String created_by;
	private Date updated_at;
	private String updated_by;
	private String alarm_name;
	private String alarm_rule;
	private String alarm_parameter_name;
	private String alarm_condition;
	private String type;
	private String alarm_notification;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getGlobal_alarm_id() {
		return global_alarm_id;
	}
	public void setGlobal_alarm_id(Long global_alarm_id) {
		this.global_alarm_id = global_alarm_id;
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
	public String getAlarm_name() {
		return alarm_name;
	}
	public void setAlarm_name(String alarm_name) {
		this.alarm_name = alarm_name;
	}
	public String getAlarm_rule() {
		return alarm_rule;
	}
	public void setAlarm_rule(String alarm_rule) {
		this.alarm_rule = alarm_rule;
	}
	public String getAlarm_parameter_name() {
		return alarm_parameter_name;
	}
	public void setAlarm_parameter_name(String alarm_parameter_name) {
		this.alarm_parameter_name = alarm_parameter_name;
	}
	public String getAlarm_condition() {
		return alarm_condition;
	}
	public void setAlarm_condition(String alarm_condition) {
		this.alarm_condition = alarm_condition;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAlarm_notification() {
		return alarm_notification;
	}
	public void setAlarm_notification(String alarm_notification) {
		this.alarm_notification = alarm_notification;
	}
	@Override
	public String toString() {
		return "GlobalAlarmRule [global_alarm_id=" + global_alarm_id + ", created_at=" + created_at + ", created_by="
				+ created_by + ", updated_at=" + updated_at + ", updated_by=" + updated_by + ", alarm_name="
				+ alarm_name + ", alarm_rule=" + alarm_rule + ", alarm_parameter_name=" + alarm_parameter_name
				+ ", alarm_condition=" + alarm_condition + ", type=" + type + ", alarm_notification="
				+ alarm_notification + "]";
	}

}
