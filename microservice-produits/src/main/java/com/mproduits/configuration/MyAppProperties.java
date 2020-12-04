package com.mproduits.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-configs")
public class MyAppProperties {

	int limitDeProduits;
	
	public MyAppProperties() {
	}

	public int getLimitDeProduits() {
		return limitDeProduits;
	}

	public void setLimitDeProduits(int limitDeProduits) {
		this.limitDeProduits = limitDeProduits;
	}
	
	
}
