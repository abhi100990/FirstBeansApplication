package com.sample;

import org.springframework.context.annotation.*;

@Configuration
public class ApplicationContextConfig {

	@Bean
	public Message myMessage(){
		Message msgid = new Message();
		msgid.setMessage("This is Abhishek Bhandari");
		return msgid;
	}
}
