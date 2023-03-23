package com.eoxys.iot_dashboard_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eoxys.iot_dashboard_app.model.Device;
import com.eoxys.iot_dashboard_app.model.Organization;
import com.eoxys.iot_dashboard_app.repository.DeviceRepository;

@Service
public class DeviceService {
	
	@Autowired
	private DeviceRepository devicerepository;
	
	public Long Devicecount() {
		return devicerepository.count();
	}
	
	
	public List<Device> AllDevices(){
		return devicerepository.findAll();
	}
	
	
	public Device GetSingleDevice(Long id) {
		Optional<Device> device = devicerepository.findById(id);
		if(device.isPresent()) {
			return device.get();
		}
		throw new RuntimeException("device is not present for this id ==>"+id);
	}
	
	
	public Device SaveDevices(Device dev) {
		return devicerepository.save(dev);
	}

}
