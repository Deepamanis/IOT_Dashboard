package com.eoxys.iot_dashboard_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eoxys.iot_dashboard_app.model.DeviceCategory;

public interface DeviceCategoryRepository extends JpaRepository<DeviceCategory, Long> {

}
