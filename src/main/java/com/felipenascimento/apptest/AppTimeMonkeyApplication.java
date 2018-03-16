package com.felipenascimento.apptest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.felipenascimento.apptest.domain.Cliente;
import com.felipenascimento.apptest.repositories.ClienteRepository;
@SpringBootApplication
public class AppTimeMonkeyApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AppTimeMonkeyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
				Cliente cli1 = new Cliente(null, "Felipe Nascimento", "felipe1.jn@gmail.com", "32132148");

		clienteRepository.save(Arrays.asList(cli1));
		
		
	}	
}
