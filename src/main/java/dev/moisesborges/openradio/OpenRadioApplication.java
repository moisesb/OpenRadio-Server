package dev.moisesborges.openradio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class OpenRadioApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenRadioApplication.class, args);
	}

}
