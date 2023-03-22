package com.eoxys.iot_dashboard_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	private DeviceCategoryRepository dcRepo;
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	private DeviceDataProfileRepository ddRepo;
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	@Autowired
	private DeviceProfileRepository dpRepo;
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	@Autowired
	private AlarmRuleRepository gaRepo;
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	@Autowired
	private OrganizationProfileRepository opRepo;
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	@Autowired
	private UserProfilesRepository upRepo;
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	@Autowired
	private NotificationEmailConfigRepository ecRepo;
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	@Autowired
	private NotificationSmsConfigRepository scRepo;
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	

}
