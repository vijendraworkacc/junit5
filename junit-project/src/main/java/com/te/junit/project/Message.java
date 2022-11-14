package com.te.junit.project;

public class Message {

	private String message;

	public String getMessaage() {
		message = "This is the actual message!";
		return message;
	}

	public boolean updateMessaage() {
		return false;
	}

	public boolean deleteMessaage() {
		return false;
	}
}
