package com.eoxys.iot_dashboard_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.eoxys.iot_dashboard_app.model.AlarmRule;
import com.eoxys.iot_dashboard_app.model.DeviceCategory;
import com.eoxys.iot_dashboard_app.model.DeviceDataProfile;
import com.eoxys.iot_dashboard_app.model.DeviceProfile;
import com.eoxys.iot_dashboard_app.model.NotificationEmailConfig;
import com.eoxys.iot_dashboard_app.model.NotificationSmsConfig;
import com.eoxys.iot_dashboard_app.model.OrganizationProfile;
import com.eoxys.iot_dashboard_app.model.UserProfiles;
import com.eoxys.iot_dashboard_app.service.GlobalConfigService;

public class GlobalConfigController {
	
	@Autowired
	private GlobalConfigService globalConfigService;
	
	
	//DEVICE-CATEGORY
	
	@GetMapping("/device-category")
	public ResponseEntity<List<DeviceCategory>> GetDeviceCategory(){
		System.out.println("GetDeviceCategory");
		return new ResponseEntity<List<DeviceCategory>>(globalConfigService.AllDeviceCategory(),HttpStatus.OK);
	}
	
	@GetMapping("/device-category-count")
	public ResponseEntity<Long> DeviceCategorycount(){
		System.out.println("DeviceCategorycount");
		return new ResponseEntity<Long>(globalConfigService.DeviceCategorycount(),HttpStatus.OK);
	}
	
	@GetMapping("/device-category/{id}")
	public ResponseEntity<DeviceCategory> GetDeviceCategoryById(@PathVariable Long id){
		System.out.println("GetDeviceCategoryById ==>"+id);
		return new ResponseEntity<DeviceCategory>(globalConfigService.GetSingleDeviceCategory(id),HttpStatus.OK);
	}
	
	@PostMapping("/device-category")
	public ResponseEntity<DeviceCategory> SaveDeviceCategory(@RequestBody DeviceCategory device_category){
		System.out.println("SaveDeviceCategory ==>"+device_category);
		return new ResponseEntity<DeviceCategory>(globalConfigService.SaveDeviceCategory(device_category),HttpStatus.CREATED);
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	
	//DEVICE-DATA-PROFILE
	
	
	@GetMapping("/device-data-profile")
	public ResponseEntity<List<DeviceDataProfile>> GetDeviceDataProfile(){
		System.out.println("GetDeviceDataProfile");
		return new ResponseEntity<List<DeviceDataProfile>>(globalConfigService.AllDeviceDataProfile(),HttpStatus.OK);
	}
	
	@GetMapping("/device-data-profile-count")
	public ResponseEntity<Long> DeviceDataProfilecount(){
		System.out.println("DeviceDataProfilecount");
		return new ResponseEntity<Long>(globalConfigService.DeviceDataProfilecount(),HttpStatus.OK);
	}
	
	@GetMapping("/device-data-profile/{id}")
	public ResponseEntity<DeviceDataProfile> GetDeviceDataProfileById(@PathVariable Long id){
		System.out.println("GetDeviceDataProfileById ==>"+id);
		return new ResponseEntity<DeviceDataProfile>(globalConfigService.GetSingleDeviceDataProfile(id),HttpStatus.OK);
	}
	
	@PostMapping("/device-data-profile")
	public ResponseEntity<DeviceDataProfile> SaveDeviceDataProfile(@RequestBody DeviceDataProfile device_data_profile){
		System.out.println("SaveDeviceDataProfile ==>"+device_data_profile);
		return new ResponseEntity<DeviceDataProfile>(globalConfigService.SaveDeviceDataProfile(device_data_profile),HttpStatus.CREATED);
	}
	
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	
	//DEVICE-PROFILE
	
	
	@GetMapping("/device-profile")
	public ResponseEntity<List<DeviceProfile>> GetDeviceProfile(){
		System.out.println("GetDeviceDataProfile");
		return new ResponseEntity<List<DeviceProfile>>(globalConfigService.AllDeviceProfile(),HttpStatus.OK);
	}
	
	@GetMapping("/device-profile-count")
	public ResponseEntity<Long> DeviceProfilecount(){
		System.out.println("DeviceDataProfilecount");
		return new ResponseEntity<Long>(globalConfigService.DeviceProfilecount(),HttpStatus.OK);
	}
	
	@GetMapping("/device-profile/{id}")
	public ResponseEntity<DeviceProfile> GetDeviceProfileById(@PathVariable Long id){
		System.out.println("GetDeviceDataProfileById ==>"+id);
		return new ResponseEntity<DeviceProfile>(globalConfigService.GetSingleDeviceProfile(id),HttpStatus.OK);
	}
	
	@PostMapping("/device-profile")
	public ResponseEntity<DeviceProfile> SaveDeviceProfile(@RequestBody DeviceProfile device_profile){
		System.out.println("SaveDeviceDataProfile ==>"+device_profile);
		return new ResponseEntity<DeviceProfile>(globalConfigService.SaveDeviceProfile(device_profile),HttpStatus.CREATED);
	}
	
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	//ALARM-RULE
	
	
	@GetMapping("/alarm-rule")
	public ResponseEntity<List<AlarmRule>> GetAlarmRule(){
		System.out.println("GetAlarmRule");
		return new ResponseEntity<List<AlarmRule>>(globalConfigService.AllAlarmRule(),HttpStatus.OK);
	}
	
	@GetMapping("/alarm-rule-count")
	public ResponseEntity<Long> AlarmRulecount(){
		System.out.println("AlarmRulecount");
		return new ResponseEntity<Long>(globalConfigService.AlarmRulecount(),HttpStatus.OK);
	}
	
	@GetMapping("/alarm-rule/{id}")
	public ResponseEntity<AlarmRule> GetAlarmRuleById(@PathVariable Long id){
		System.out.println("GetAlarmRuleById ==>"+id);
		return new ResponseEntity<AlarmRule>(globalConfigService.GetSingleAlarmRule(id),HttpStatus.OK);
	}
	
	@PostMapping("/alarm-rule")
	public ResponseEntity<AlarmRule> SaveAlarmRule(@RequestBody AlarmRule alarm_rule){
		System.out.println("SaveAlarmRule ==>"+alarm_rule);
		return new ResponseEntity<AlarmRule>(globalConfigService.SaveAlarmRule(alarm_rule),HttpStatus.CREATED);
	}
	
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	//ORGANIZATION-PROFILE
	
	
	@GetMapping("/organization-profile")
	public ResponseEntity<List<OrganizationProfile>> GetOrganizationProfile(){
		System.out.println("GetOrganizationProfile");
		return new ResponseEntity<List<OrganizationProfile>>(globalConfigService.AllOrganizationProfile(),HttpStatus.OK);
	}
	
	@GetMapping("/organization-profile-count")
	public ResponseEntity<Long> OrganizationProfilecount(){
		System.out.println("OrganizationProfilecount");
		return new ResponseEntity<Long>(globalConfigService.OrganizationProfilecount(),HttpStatus.OK);
	}
	
	@GetMapping("/organization-profile/{id}")
	public ResponseEntity<OrganizationProfile> GetOrganizationProfileById(@PathVariable Long id){
		System.out.println("GetOrganizationProfileeById ==>"+id);
		return new ResponseEntity<OrganizationProfile>(globalConfigService.GetSingleOrganizationProfile(id),HttpStatus.OK);
	}
	
	@PostMapping("/organization-profile")
	public ResponseEntity<OrganizationProfile> SaveOrganizationProfile(@RequestBody OrganizationProfile organization_profile){
		System.out.println("SaveOrganizationProfile ==>"+organization_profile);
		return new ResponseEntity<OrganizationProfile>(globalConfigService.SaveOrganizationProfile(organization_profile),HttpStatus.CREATED);
	}
	
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	//USER-PROFILE
	
	
	@GetMapping("/user-profile")
	public ResponseEntity<List<UserProfiles>> GetUserProfiles(){
		System.out.println("GetUserProfiles");
		return new ResponseEntity<List<UserProfiles>>(globalConfigService.AllUserProfiles(),HttpStatus.OK);
	}
	
	@GetMapping("/user-profile-count")
	public ResponseEntity<Long> UserProfilescount(){
		System.out.println("UserProfilescount");
		return new ResponseEntity<Long>(globalConfigService.UserProfilescount(),HttpStatus.OK);
	}
	
	@GetMapping("/user-profile/{id}")
	public ResponseEntity<UserProfiles> GetUserProfilesById(@PathVariable Long id){
		System.out.println("GetUserProfilesById ==>"+id);
		return new ResponseEntity<UserProfiles>(globalConfigService.GetSingleUserProfiles(id),HttpStatus.OK);
	}
	
	@PostMapping("/user-profile")
	public ResponseEntity<UserProfiles> SaveUserProfiles(@RequestBody UserProfiles user_profile){
		System.out.println("SaveUserProfiles ==>"+user_profile);
		return new ResponseEntity<UserProfiles>(globalConfigService.SaveUserProfiles(user_profile),HttpStatus.CREATED);
	}
	
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	//NOTIFICATION-EMAIL-CONFIG
	
	
	@GetMapping("/notification-email-config")
	public ResponseEntity<List<NotificationEmailConfig>> GetNotificationEmailConfig(){
		System.out.println("GetNotificationEmailConfig");
		return new ResponseEntity<List<NotificationEmailConfig>>(globalConfigService.AllNotificationEmailConfig(),HttpStatus.OK);
	}
	
	
	@GetMapping("/notification-email-config-count")
	public ResponseEntity<Long> NotificationEmailConfigcount(){
		System.out.println("NotificationEmailConfigcount");
		return new ResponseEntity<Long>(globalConfigService.NotificationEmailConfigcount(),HttpStatus.OK);
	}
	
	@GetMapping("/notification-email-config/{id}")
	public ResponseEntity<NotificationEmailConfig> GetNotificationEmailConfigById(@PathVariable Long id){
		System.out.println("GetNotificationEmailConfigById ==>"+id);
		return new ResponseEntity<NotificationEmailConfig>(globalConfigService.GetSingleNotificationEmailConfig(id),HttpStatus.OK);
	}
	
	@PostMapping("/notification-email-config")
	public ResponseEntity<NotificationEmailConfig> SaveNotificationEmailConfig(@RequestBody NotificationEmailConfig notification_email_config){
		System.out.println("SaveNotificationEmailConfig ==>"+notification_email_config);
		return new ResponseEntity<NotificationEmailConfig>(globalConfigService.SaveNotificationEmailConfig(notification_email_config),HttpStatus.CREATED);
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	//NOTIFICATION-SMS-CONFIG
	
	
	@GetMapping("/notification-sms-config")
	public ResponseEntity<List<NotificationSmsConfig>> GetNotificationSmsConfig(){
		System.out.println("GetNotificationSmsConfig");
		return new ResponseEntity<List<NotificationSmsConfig>>(globalConfigService.AllNotificationSmsConfig(),HttpStatus.OK);
	}
	
	
	@GetMapping("/notification-sms-config-count")
	public ResponseEntity<Long> NotificationSmsConfigcount(){
		System.out.println("NotificationSmsConfigcount");
		return new ResponseEntity<Long>(globalConfigService.NotificationSmsConfigcount(),HttpStatus.OK);
	}
	
	@GetMapping("/notification-sms-config/{id}")
	public ResponseEntity<NotificationSmsConfig> GetNotificationSmsConfigById(@PathVariable Long id){
		System.out.println("GetNotificationSmsConfigById ==>"+id);
		return new ResponseEntity<NotificationSmsConfig>(globalConfigService.GetSingleNotificationSmsConfig(id),HttpStatus.OK);
	}
	
	@PostMapping("/notification-sms-config")
	public ResponseEntity<NotificationSmsConfig> SaveNotificationSmsConfig(@RequestBody NotificationSmsConfig notification_sms_config){
		System.out.println("SaveNotificationSmsConfig ==>"+notification_sms_config);
		return new ResponseEntity<NotificationSmsConfig>(globalConfigService.SaveNotificationSmsConfig(notification_sms_config),HttpStatus.CREATED);
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	

}
