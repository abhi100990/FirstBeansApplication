package com.sample;

public class GoogleMessageService implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending message using Google message service : " + message);	
	}

}
