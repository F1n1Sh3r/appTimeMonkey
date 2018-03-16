package com.felipenascimento.apptest.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipenascimento.apptest.domain.Cliente;
import com.felipenascimento.apptest.repositories.ClienteRepository;
@Service
public class DBService {
		
	@Autowired
	private ClienteRepository clienteRepository;
	public void instantiateTestDataBase() {
		
		Cliente cli1 = new Cliente(null, "Felipe Nascimento", "felipe1.jn@gmail.com", "123456789");
		Cliente cli2 = new Cliente(null, "Bruno Oliveira", "bruno@monkey.exchange", "987654321");

		clienteRepository.save(Arrays.asList(cli1,cli2));
		
	}
}
