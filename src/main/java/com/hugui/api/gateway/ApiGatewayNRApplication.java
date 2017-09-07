package com.hugui.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

/**
 * 
 * @author hugui
 *
 */

@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayNRApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayNRApplication.class, args);
	}
	
	
	@RefreshScope
	@ConfigurationProperties("zuul")
	public ZuulProperties zuulProperties(){
		return new ZuulProperties();
	}
}
