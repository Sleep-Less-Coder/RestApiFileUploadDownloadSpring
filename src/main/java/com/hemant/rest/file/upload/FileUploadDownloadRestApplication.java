package com.hemant.rest.file.upload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.hemant.rest.file.upload.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class FileUploadDownloadRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadDownloadRestApplication.class, args);
	}
}
