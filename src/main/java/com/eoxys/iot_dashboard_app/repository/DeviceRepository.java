package com.eoxys.iot_dashboard_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eoxys.iot_dashboard_app.model.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {

}
