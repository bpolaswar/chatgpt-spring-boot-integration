package com.openai;

import com.openai.controller.GrammerCorrectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GrammerCorrectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrammerCorrectionApplication.class, args);
	}
}
