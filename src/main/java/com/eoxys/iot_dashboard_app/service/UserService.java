package com.eoxys.iot_dashboard_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.eoxys.iot_dashboard_app.model.Organization;
import com.eoxys.iot_dashboard_app.model.PlatformInfo;
import com.eoxys.iot_dashboard_app.model.Users;
import com.eoxys.iot_dashboard_app.repository.OrganizationRepository;
import com.eoxys.iot_dashboard_app.repository.PlatformInfoRepository;
import com.eoxys.iot_dashboard_app.repository.UsersRepository;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class UserService {
	
	@Autowired
	private UsersRepository uRepo;
	
	public Long UserCount() {
		return uRepo.count();
	}
	
	
	public List<Users> AllUsers(){
		return uRepo.findAll();
	}
	
	
	public Users GetSingleUser(Long id) {
		Optional<Users> users = uRepo.findById(id);
		if(users.isPresent()) {
			return users.get();
			
		}
		
		throw new RuntimeException("User is not present for this id ==>"+id);
	}
	
	
	public Users SaveUser(Users users) {
		return uRepo.save(users);
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	@Autowired
	private OrganizationRepository oRepo;
	
	
	public Long OrganizationCount() {
		return oRepo.count();
	}
	
	
	public List<Organization> AllOrganization(){
		return oRepo.findAll();
	}
	
	
	public Organization GetSingleOrganization(Long id) {
		Optional<Organization> organization = oRepo.findById(id);
		if(organization.isPresent()) {
			return organization.get();
		}
		throw new RuntimeException("Organization is not present for this id ==>"+id);
	}
	
	
	public Organization SaveOrganization(Organization org) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		return oRepo.save(org);
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	@Autowired
    private PlatformInfoRepository piRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    public Long PlatformCount() {
		return piRepository.count();
	}
	
	
	public List<PlatformInfo> AllPlatform(){
		return piRepository.findAll();
	}
	
	
	public PlatformInfo GetSinglePlatform(Integer id) {
		Optional<PlatformInfo> users = piRepository.findById(id);
		if(users.isPresent()) {
			return users.get();
			
		}
		
		throw new RuntimeException("Platform is not present for this id ==>"+id);
	}
	
	public String addUser(PlatformInfo userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        piRepository.save(userInfo);
        return "user added to system ";
    }

}
