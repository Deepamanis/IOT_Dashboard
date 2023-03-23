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
	private UsersRepository usersRepository;
	
	public Long UserCount() {
		return usersRepository.count();
	}
	
	
	public List<Users> AllUsers(){
		return usersRepository.findAll();
	}
	
	
	public Users GetSingleUser(Long id) {
		Optional<Users> users = usersRepository.findById(id);
		if(users.isPresent()) {
			return users.get();
			
		}
		
		throw new RuntimeException("User is not present for this id ==>"+id);
	}
	
	
	public Users SaveUser(Users users) {
		return usersRepository.save(users);
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------
	
	@Autowired
	private OrganizationRepository organizationRepository;
	
	
	public Long OrganizationCount() {
		return organizationRepository.count();
	}
	
	
	public List<Organization> AllOrganization(){
		return organizationRepository.findAll();
	}
	
	
	public Organization GetSingleOrganization(Long id) {
		Optional<Organization> organization = organizationRepository.findById(id);
		if(organization.isPresent()) {
			return organization.get();
		}
		throw new RuntimeException("Organization is not present for this id ==>"+id);
	}
	
	
	public Organization SaveOrganization(Organization org) {
		return organizationRepository.save(org);
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------

}
