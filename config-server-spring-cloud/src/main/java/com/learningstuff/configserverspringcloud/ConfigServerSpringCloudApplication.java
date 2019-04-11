package com.learningstuff.configserverspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerSpringCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerSpringCloudApplication.class, args);
    }

}
