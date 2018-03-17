package com.felipenascimento.apptest.services;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {
	
	void sendEmail(SimpleMailMessage msg);
	
}
