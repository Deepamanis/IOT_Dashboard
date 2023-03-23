package com.eoxys.iot_dashboard_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eoxys.iot_dashboard_app.model.AlarmRule;
import com.eoxys.iot_dashboard_app.model.DeviceCategory;
import com.eoxys.iot_dashboard_app.model.DeviceDataProfile;
import com.eoxys.iot_dashboard_app.model.DeviceProfile;
import com.eoxys.iot_dashboard_app.model.NotificationEmailConfig;
import com.eoxys.iot_dashboard_app.model.NotificationSmsConfig;
import com.eoxys.iot_dashboard_app.model.OrganizationProfile;
import com.eoxys.iot_dashboard_app.model.UserProfiles;
import com.eoxys.iot_dashboard_app.repository.AlarmRuleRepository;
import com.eoxys.iot_dashboard_app.repository.DeviceCategoryRepository;
import com.eoxys.iot_dashboard_app.repository.DeviceDataProfileRepository;
import com.eoxys.iot_dashboard_app.repository.DeviceProfileRepository;
import com.eoxys.iot_dashboard_app.repository.NotificationEmailConfigRepository;
import com.eoxys.iot_dashboard_app.repository.NotificationSmsConfigRepository;
import com.eoxys.iot_dashboard_app.repository.OrganizationProfileRepository;
import com.eoxys.iot_dashboard_app.repository.UserProfilesRepository;

@Service
public class GlobalConfigService {
	
	@Autowired
	private DeviceCategoryRepository devicecategoryrepository;
	
	public Long DeviceCategorycount() {
		return devicecategoryrepository.count();
	}
	
	
	public List<DeviceCategory> AllDeviceCategory(){
		return devicecategoryrepository.findAll();
	}
	
	
	public DeviceCategory GetSingleDeviceCategory(Long id) {
		Optional<DeviceCategory> device = devicecategoryrepository.findById(id);
		if(device.isPresent()) {
			return device.get();
		}
		throw new RuntimeException("device category is not present for this id ==>"+id);
	}
	
	
	public DeviceCategory SaveDeviceCategory(DeviceCategory devicecategory) {
		return devicecategoryrepository.save(devicecategory);
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	
	@Autowired
	private DeviceDataProfileRepository devicedataprofilerepository;
	
	
	public Long DeviceDataProfilecount() {
		return devicedataprofilerepository.count();
	}
	
	
	public List<DeviceDataProfile> AllDeviceDataProfile(){
		return devicedataprofilerepository.findAll();
	}
	
	
	public DeviceDataProfile GetSingleDeviceDataProfile(Long id) {
		Optional<DeviceDataProfile> device_data_profile = devicedataprofilerepository.findById(id);
		if(device_data_profile.isPresent()) {
			return device_data_profile.get();
		}
		throw new RuntimeException("device data profile is not present for this id ==>"+id);
	}
	
	
	public DeviceDataProfile SaveDeviceDataProfile(DeviceDataProfile devicedataprofile) {
		return devicedataprofilerepository.save(devicedataprofile);
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	@Autowired
	private DeviceProfileRepository deviceprofilerepository;
	
	
	public Long DeviceProfilecount() {
		return deviceprofilerepository.count();
	}
	
	
	public List<DeviceProfile> AllDeviceProfile(){
		return deviceprofilerepository.findAll();
	}
	
	
	public DeviceProfile GetSingleDeviceProfile(Long id) {
		Optional<DeviceProfile> device_profile = deviceprofilerepository.findById(id);
		if(device_profile.isPresent()) {
			return device_profile.get();
		}
		throw new RuntimeException("device profile is not present for this id ==>"+id);
	}
	
	
	public DeviceProfile SaveDeviceProfile(DeviceProfile deviceprofile) {
		return deviceprofilerepository.save(deviceprofile);
	}
	
	
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	@Autowired
	private AlarmRuleRepository alarmrulerepository;
	
	public Long AlarmRulecount() {
		return alarmrulerepository.count();
	}
	
	
	public List<AlarmRule> AllAlarmRule(){
		return alarmrulerepository.findAll();
	}
	
	
	public AlarmRule GetSingleAlarmRule(Long id) {
		Optional<AlarmRule> alarm_rule = alarmrulerepository.findById(id);
		if(alarm_rule.isPresent()) {
			return alarm_rule.get();
		}
		throw new RuntimeException("alarm rule is not present for this id ==>"+id);
	}
	
	
	public AlarmRule SaveAlarmRule(AlarmRule alarmrule) {
		return alarmrulerepository.save(alarmrule);
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	@Autowired
	private OrganizationProfileRepository organizationprofilerepository;
	
	
	public Long OrganizationProfilecount() {
		return organizationprofilerepository.count();
	}
	
	
	public List<OrganizationProfile> AllOrganizationProfile(){
		return organizationprofilerepository.findAll();
	}
	
	
	public OrganizationProfile GetSingleOrganizationProfile(Long id) {
		Optional<OrganizationProfile> organization_profile = organizationprofilerepository.findById(id);
		if(organization_profile.isPresent()) {
			return organization_profile.get();
		}
		throw new RuntimeException("organization profile is not present for this id ==>"+id);
	}
	
	
	public OrganizationProfile SaveOrganizationProfile(OrganizationProfile organizationprofile) {
		return organizationprofilerepository.save(organizationprofile);
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	@Autowired
	private UserProfilesRepository userprofilesrepository;
	
	
	public Long UserProfilescount() {
		return userprofilesrepository.count();
	}
	
	
	public List<UserProfiles> AllUserProfiles(){
		return userprofilesrepository.findAll();
	}
	
	
	public UserProfiles GetSingleUserProfiles(Long id) {
		Optional<UserProfiles> user_profiles = userprofilesrepository.findById(id);
		if(user_profiles.isPresent()) {
			return user_profiles.get();
		}
		throw new RuntimeException("user profile is not present for this id ==>"+id);
	}
	
	
	public UserProfiles SaveUserProfiles(UserProfiles userprofiles) {
		return userprofilesrepository.save(userprofiles);
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	@Autowired
	private NotificationEmailConfigRepository notificationemailconfigrepository;
	
	public Long NotificationEmailConfigcount() {
		return notificationemailconfigrepository.count();
	}
	
	
	public List<NotificationEmailConfig> AllNotificationEmailConfig(){
		return notificationemailconfigrepository.findAll();
	}
	
	
	public NotificationEmailConfig GetSingleNotificationEmailConfig(Long id) {
		Optional<NotificationEmailConfig> email_config = notificationemailconfigrepository.findById(id);
		if(email_config.isPresent()) {
			return email_config.get();
		}
		throw new RuntimeException("Notification Email Config is not present for this id ==>"+id);
	}
	
	
	public NotificationEmailConfig SaveNotificationEmailConfig(NotificationEmailConfig notificationemailconfig) {
		return notificationemailconfigrepository.save(notificationemailconfig);
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	@Autowired
	private NotificationSmsConfigRepository notificationsmsconfigrepository;
	
	public Long NotificationSmsConfigcount() {
		return notificationsmsconfigrepository.count();
	}
	
	
	public List<NotificationSmsConfig> AllNotificationSmsConfig(){
		return notificationsmsconfigrepository.findAll();
	}
	
	
	public NotificationSmsConfig GetSingleNotificationSmsConfig(Long id) {
		Optional<NotificationSmsConfig> sms_config = notificationsmsconfigrepository.findById(id);
		if(sms_config.isPresent()) {
			return sms_config.get();
		}
		throw new RuntimeException("Notification Sms Config is not present for this id ==>"+id);
	}
	
	
	public NotificationSmsConfig SaveNotificationSmsConfig(NotificationSmsConfig notificationsmsconfig) {
		return notificationsmsconfigrepository.save(notificationsmsconfig);
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	

}
