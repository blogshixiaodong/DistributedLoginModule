package cn.com.bosssoft.registrycentre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryCentreApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryCentreApplication.class, args);
	}
}
