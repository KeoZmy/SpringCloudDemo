package com.keozhao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@EnableSidecar
@SpringBootApplication
public class SidecarPythonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SidecarPythonApplication.class, args);
	}
}
