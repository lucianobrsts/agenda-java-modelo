package br.com.agendajavamodelo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "usuario")
public class Usuario extends AbstractEntity {

	private static final long serialVersionUID = -4575202674401302951L;

	@Column(name = "nome", nullable = false, length = 60)
	private String nome;

	@Column(name = "login", nullable = false, length = 12)
	private String login;

	@Column(name = "password", nullable = false, length = 8)
	private String password;
	
	public Usuario() {
		
	}

	public Usuario(String nome, String login, String password) {
		this.nome = nome;
		this.login = login;
		this.password = password;
	}

}
