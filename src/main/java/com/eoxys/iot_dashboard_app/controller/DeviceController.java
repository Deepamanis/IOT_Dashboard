package com.eoxys.iot_dashboard_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eoxys.iot_dashboard_app.model.Device;
import com.eoxys.iot_dashboard_app.service.DeviceService;

@RestController
public class DeviceController {
	
	@Autowired
	private DeviceService deviceService;
	
	@GetMapping("/devices")
	public ResponseEntity<List<Device>> GetDevices(){
		System.out.println("GetDevices");
		return new ResponseEntity<List<Device>>(deviceService.AllDevices(),HttpStatus.OK);
	}
	
	@GetMapping("/devicecount")
	public ResponseEntity<Long> Devicecount(){
		System.out.println("devicecount");
		return new ResponseEntity<Long>(deviceService.Devicecount(),HttpStatus.OK);
	}
	
	@GetMapping("/devices/{id}")
	public ResponseEntity<Device> GetDeviceById(@PathVariable Long id){
		System.out.println("GetDeviceById ==>"+id);
		return new ResponseEntity<Device>(deviceService.GetSingleDevice(id),HttpStatus.OK);
	}
	
	@PostMapping("/devices")
	public ResponseEntity<Device> SaveOrg(@RequestBody Device dev){
		System.out.println("SaveDevice ==>"+dev);
		return new ResponseEntity<Device>(deviceService.SaveDevices(dev),HttpStatus.CREATED);
	}
	
	
	
	
	
	

}
