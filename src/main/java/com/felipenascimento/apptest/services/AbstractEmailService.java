package com.felipenascimento.apptest.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import com.felipenascimento.apptest.domain.Cliente;

public abstract class AbstractEmailService implements EmailService{
	
	@Value("${defaut.sender}")
	private String sender;
	
	
	public void sendOrderConfirmationEmail(Cliente obj) {
		SimpleMailMessage sm = prepareSimpleMailMessageFromCliente(obj);
		sendEmail(sm);
	} 
	
	
	protected SimpleMailMessage prepareSimpleMailMessageFromCliente(Cliente obj) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo(sender);
		sm.setFrom(sender);
		sm.setSubject("Teste Mail \n Nome: " + obj.getNome() + "\n Email: "+ obj.getEmail());
		sm.setSentDate(new Date(System.currentTimeMillis()));
		sm.setText(obj.toString());
		return sm;
	}
	
}
