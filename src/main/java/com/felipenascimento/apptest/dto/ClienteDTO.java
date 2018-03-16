package com.felipenascimento.apptest.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.felipenascimento.apptest.domain.Cliente;

public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;
		private Integer id;
		
		@NotEmpty(message="O campo nome nao pode permanecer vazio!")
		@Length(min=4, max =100, message="O tamanho deve ser ente 4 e 100 caracteres")
		private String nome;
		private String email;
		

		
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public ClienteDTO() {
			
		}
		
		public ClienteDTO( Cliente obj) {
			id = obj.getId();
			nome = obj.getNome();
			email = obj.getEmail();
		}
		
		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		
		
		
}
