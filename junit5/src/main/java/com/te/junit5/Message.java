package com.te.junit5;

public class Message {
	private String message;

	public Message() {
		super();
	}

	public String getMessage() {
		message = "This is the actual message!";
		return message;
	}

	public boolean sendMessage() {
		return false;
	}

	public boolean updateMessage() {
		return true;
	}
}
