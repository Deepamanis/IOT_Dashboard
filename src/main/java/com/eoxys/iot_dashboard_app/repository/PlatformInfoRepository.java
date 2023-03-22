package com.eoxys.iot_dashboard_app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eoxys.iot_dashboard_app.model.PlatformInfo;

public interface PlatformInfoRepository extends JpaRepository<PlatformInfo, Integer> {
	Optional<PlatformInfo> findByName(String username);

}
