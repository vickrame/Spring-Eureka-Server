/**
 * 
 */
package com.clea.server.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author vickrame
 *
 */
@ComponentScan
@Configuration
@EnableAutoConfiguration
@EnableEurekaServer
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
