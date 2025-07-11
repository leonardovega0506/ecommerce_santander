package com.minsait.ecommerce.bootloader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.minsait.ecommerce")
public class BootloaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootloaderApplication.class, args);
	}

}
