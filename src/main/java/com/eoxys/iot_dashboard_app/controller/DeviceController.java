package com.eoxys.iot_dashboard_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.eoxys.iot_dashboard_app.service.DeviceService;

@RestController
public class DeviceController {
	
	@Autowired
	private DeviceService dService;
	

}
