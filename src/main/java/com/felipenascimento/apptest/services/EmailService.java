
package com.felipenascimento.apptest.services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.felipenascimento.apptest.domain.Cliente;

@Service
public interface EmailService {


	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}