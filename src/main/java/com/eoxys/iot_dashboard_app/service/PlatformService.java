package com.eoxys.iot_dashboard_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.eoxys.iot_dashboard_app.model.PlatformInfo;
import com.eoxys.iot_dashboard_app.repository.PlatformInfoRepository;

@Service
public class PlatformService {
	
	@Autowired
    private PlatformInfoRepository platformInfoRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    public Long PlatformCount() {
		return platformInfoRepository.count();
	}
	
	
	public List<PlatformInfo> AllPlatform(){
		return platformInfoRepository.findAll();
	}
	
	
	public PlatformInfo GetSinglePlatform(Integer id) {
		Optional<PlatformInfo> users = platformInfoRepository.findById(id);
		if(users.isPresent()) {
			return users.get();
			
		}
		
		throw new RuntimeException("Platform is not present for this id ==>"+id);
	}
	
	public String addPlatform(PlatformInfo userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        platformInfoRepository.save(userInfo);
        return "user added to system ";
    }

}
