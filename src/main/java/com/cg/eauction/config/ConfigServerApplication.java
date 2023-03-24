package com.cg.eauction.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
	    ApplicationContext ac = SpringApplication.run(ConfigServerApplication.class, args);
        String activeProfile = ac.getEnvironment().getActiveProfiles()[0];
        if (StringUtils.equalsIgnoreCase(activeProfile, "dev")) {
            StartingServices.main(args);
        }
	}
}
