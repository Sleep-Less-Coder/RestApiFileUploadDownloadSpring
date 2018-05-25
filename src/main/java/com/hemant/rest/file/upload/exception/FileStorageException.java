package com.hemant.rest.file.upload.exception;

public class FileStorageException extends RuntimeException {

	private static final long serialVersionUID = -6594133675503649545L;

	public FileStorageException(String message) {
		super(message);
	}
	
	public FileStorageException(String message, Throwable cause) {
		super(message, cause);
	}
}
