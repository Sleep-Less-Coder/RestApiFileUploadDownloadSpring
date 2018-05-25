package com.hemant.rest.file.upload.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 
 * @author hemant
 * Binds to the properties used in the application.properties file
 * Starting with prefix = file
 */
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
	
	private String uploadDir;

	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}
}
