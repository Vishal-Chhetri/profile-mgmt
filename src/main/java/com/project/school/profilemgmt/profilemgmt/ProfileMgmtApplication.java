package com.project.school.profilemgmt.profilemgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan({"com.project.school.profilemgmt.controller","com.project.school.profilemgmt.service"})
@EntityScan("com.project.school.profilemgmt.model")
@EnableMongoRepositories("com.project.school.profilemgmt.repository")
public class ProfileMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileMgmtApplication.class, args);
	}

}
