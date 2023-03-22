package com.eoxys.iot_dashboard_app.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlatformAuthRequest {
	
	private String username ;
    private String password;

}
