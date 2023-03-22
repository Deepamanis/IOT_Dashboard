package com.eoxys.iot_dashboard_app.security_config;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import com.eoxys.iot_dashboard_app.model.PlatformInfo;
import com.eoxys.iot_dashboard_app.repository.PlatformInfoRepository;
@Component
public class PlatformDetailsService implements UserDetailsService {
	
	@Autowired
    private PlatformInfoRepository repository;

	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<PlatformInfo> userInfo = repository.findByName(username);
        return userInfo.map(PlatformDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("user not found " + username));

    }

}
