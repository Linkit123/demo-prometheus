package com.link2mountain.demoprometheus;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoPrometheusApplication {

//	@Autowired
//	private HealthEndpoint healthEndpoint;
//
//	@Bean
//	public MeterRegistryCustomizer dbHealth() {
//		return registry -> registry.gauge("db_health", healthEndpoint, healthEndpoint -> {
//			Health dbHealth = (Health) healthEndpoint.health().getDetails().get("db");
//			return (int) dbHealth.getDetails().get("hello");
//		});
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoPrometheusApplication.class, args);
	}

}
