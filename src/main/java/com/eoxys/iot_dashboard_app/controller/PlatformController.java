package com.eoxys.iot_dashboard_app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eoxys.iot_dashboard_app.dto.PlatformAuthRequest;
import com.eoxys.iot_dashboard_app.model.Organization;
import com.eoxys.iot_dashboard_app.model.PlatformInfo;
import com.eoxys.iot_dashboard_app.security_config.JwtConfig;
import com.eoxys.iot_dashboard_app.service.PlatformService;
import com.eoxys.iot_dashboard_app.service.UserService;

@RestController
public class PlatformController {
	
	@Autowired
    private PlatformService pService;
    @Autowired
    private JwtConfig jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;
    
    
    @GetMapping("/platforms")
	public ResponseEntity<List<PlatformInfo>> GetOrgaization(){
		System.out.println("GetOrgaization");
		return new ResponseEntity<List<PlatformInfo>>(pService.AllPlatform(),HttpStatus.OK);
	}
	
	@GetMapping("/platformcount")
	public ResponseEntity<Long> OrgCount(){
		System.out.println("OrgCount");
		return new ResponseEntity<Long>(pService.PlatformCount(),HttpStatus.OK);
	}
	
	@GetMapping("/platforms/{id}")
	public ResponseEntity<PlatformInfo> GetOrgById(@PathVariable Integer id){
		System.out.println("GetOrgById ==>"+id);
		return new ResponseEntity<PlatformInfo>(pService.GetSinglePlatform(id),HttpStatus.OK);
	}
    
    
    @PostMapping("/platform")
    public String addNewUser(@RequestBody PlatformInfo userInfo) {
    	System.out.println("User");
        return pService.addUser(userInfo);
    }
    
    @PostMapping("/authenticate")
    public Map<String, String> authenticateAndGetToken(@RequestBody PlatformAuthRequest authRequest) {
    	System.out.println("Authenticate");
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(authRequest.getUsername());
        } else {
            throw new UsernameNotFoundException("invalid user request !");
        }


    }
    
    @GetMapping("/notification")
    public String notification() {
        return "Welcome this notification endpoint is secure";
    }
    
    
    @GetMapping("/device_data")
    public String device_data() {
        return "Welcome this device_data endpoint is secure";
    }

}
