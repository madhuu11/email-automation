package com.madhu.email_automation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhu.email_automation.service.EmailSenderService;

@RestController
public class EmailController {

	@Autowired
	private EmailSenderService emailSenderService;
	
	@GetMapping("sendEmail")
	public String sendEmail() {
		emailSenderService.sendEmail("madhushreek1105@gmail.com", "Demo Email Test", "Demo Email Test Content");
		return "Email Sent Successfully..........";
	}
}
