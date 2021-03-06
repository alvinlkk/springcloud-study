package com.alvinlkk.cloud.eurekaserversecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSecurityApplication.class, args);
    }

}
