package com.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   AbstractApplicationContext  context = 
             new ClassPathXmlApplicationContext("applicationContext.xml");
	   ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
	   
	   Message myNewMessage = ctx.getBean(Message.class);
	   Message myMessage = (Message) context.getBean("messageId");
      
      	MessageService messageService = new GoogleMessageService();
      	messageService.sendMessage(myMessage.message);
      	messageService.sendMessage(myNewMessage.message);
      
      	messageService = new YahooMessageService();
     	messageService.sendMessage(myMessage.message);
     	messageService.sendMessage(myNewMessage.message);
      
      
      
    	   
    	   
      
      
   }
}

