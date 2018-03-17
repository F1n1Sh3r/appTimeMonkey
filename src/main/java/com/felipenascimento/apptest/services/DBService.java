package com.felipenascimento.apptest.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.felipenascimento.apptest.domain.Cliente;
import com.felipenascimento.apptest.domain.enums.Perfil;
import com.felipenascimento.apptest.repositories.ClienteRepository;
@Service
public class DBService {
	
	@Autowired BCryptPasswordEncoder pe;
	
	@Autowired
	private ClienteRepository clienteRepository;
	public void instantiateTestDataBase() {
		
		Cliente cli1 = new Cliente(null, "Felipe Nascimento", "felipe1.jn@gmail.com", "12345678",pe.encode("123"));
		Cliente cli2 = new Cliente(null, "Bruno Oliveira", "bruno@monkey.exchange", "987654321", pe.encode("321"));
		cli2.addPerfil(Perfil.ADMIN);
		
		
		clienteRepository.save(Arrays.asList(cli1,cli2));
		
	}
}
