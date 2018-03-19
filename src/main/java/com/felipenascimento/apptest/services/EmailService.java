package com.felipenascimento.apptest.services;

import org.springframework.mail.SimpleMailMessage;

import com.felipenascimento.apptest.domain.Cliente;



public interface EmailService {


	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}