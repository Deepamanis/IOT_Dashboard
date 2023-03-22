package com.eoxys.iot_dashboard_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eoxys.iot_dashboard_app.repository.DeviceRepository;

@Service
public class DeviceService {
	
	@Autowired
	private DeviceRepository dRepo;

}
