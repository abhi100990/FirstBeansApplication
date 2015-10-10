package com.sample;

public class YahooMessageService implements MessageService{
	
	@Override
	public void sendMessage(String message)
	{
		System.out.println("Sending message using Yahoo message service : " + message);
	}
}
