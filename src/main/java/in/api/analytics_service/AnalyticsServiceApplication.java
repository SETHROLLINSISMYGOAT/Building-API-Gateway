package in.api.analytics_service;

import ch.qos.logback.core.rolling.helper.MonoTypedConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.mongodb.autoconfigure.MongoAutoConfiguration;
import org.springframework.boot.security.autoconfigure.SecurityAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class AnalyticsServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(AnalyticsServiceApplication.class, args);
	}

}
