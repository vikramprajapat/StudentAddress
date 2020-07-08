package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Address;

import brave.sampler.Sampler;

@RestController
@SpringBootApplication
public class StudentAddressApplication {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/getStudentAddress/{name}")
	public Address getStudentDetails(@PathVariable(name = "name") String name) {
		logger.info("{}", name);

		return new Address("10/100", "close to city bank", "jaipur", name);
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentAddressApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;

	}
}
