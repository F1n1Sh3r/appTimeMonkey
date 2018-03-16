package com.felipenascimento.apptest.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.felipenascimento.apptest.domain.Cliente;
import com.felipenascimento.apptest.services.validation.ClienteInsert;

@ClienteInsert
public class ClienteNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
		private Integer id;
		
		@NotEmpty(message="O campo 'Nome' não pode permanecer vazio!")
		@Length(min=4, max =100, message="O tamanho deve ser ente 4 e 100 caracteres")
		private String nome;
		
		@NotEmpty(message="O campo 'Email' é obrigatório! ")
		@Email(message="Email inválido!")
		private String email;
		
		@NotEmpty(message="O campo 'Telefone' é obrigatório! ")
		private String telefone;
		
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public ClienteNewDTO() {
			
		}
		
		public ClienteNewDTO( Cliente obj) {
			id = obj.getId();
			nome = obj.getNome();
			email = obj.getEmail();
			telefone = obj.getTelefone();
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

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
}
