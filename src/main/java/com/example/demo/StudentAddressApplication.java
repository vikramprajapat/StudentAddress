package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Address;

@RestController
@SpringBootApplication
public class StudentAddressApplication {
	

	@RequestMapping(value = "/getStudentAddress/{name}")
	public Address getStudentDetails(@PathVariable(name = "name") String name) {
		return new Address("10/100", "close to city bank", "jaipur", name);
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentAddressApplication.class, args);
	}

}
