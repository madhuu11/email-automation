package com.madhu.email_automation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.madhu.email_automation.service.EmailSenderService;

@SpringBootApplication
public class EmailAutomationApplication {

//	@Autowired
//	private EmailSenderService senderService;
	
	public static void main(String[] args) {
		SpringApplication.run(EmailAutomationApplication.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void sendEmail() {
//		senderService.sendEmail("madhushreek1105@gmail.com", "happy birthday", "Birthday wishes for demo");
//	}
}
