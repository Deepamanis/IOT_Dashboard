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

import com.eoxys.iot_dashboard_app.model.Organization;
import com.eoxys.iot_dashboard_app.model.Users;
import com.eoxys.iot_dashboard_app.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/organizations")
	public ResponseEntity<List<Organization>> GetOrgaization(){
		System.out.println("GetOrgaization");
		return new ResponseEntity<List<Organization>>(userService.AllOrganization(),HttpStatus.OK);
	}
	
	@GetMapping("/orgcount")
	public ResponseEntity<Long> OrgCount(){
		System.out.println("OrgCount");
		return new ResponseEntity<Long>(userService.OrganizationCount(),HttpStatus.OK);
	}
	
	@GetMapping("/organizations/{id}")
	public ResponseEntity<Organization> GetOrgById(@PathVariable Long id){
		System.out.println("GetOrgById ==>"+id);
		return new ResponseEntity<Organization>(userService.GetSingleOrganization(id),HttpStatus.OK);
	}
	
	@PostMapping("/organizations")
	public ResponseEntity<Organization> SaveOrg(@RequestBody Organization org){
		System.out.println("SaveOrg data ==>"+org);
		return new ResponseEntity<Organization>(userService.SaveOrganization(org),HttpStatus.CREATED);
	}
	

}
