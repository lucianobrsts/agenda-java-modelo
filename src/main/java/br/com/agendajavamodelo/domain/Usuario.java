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

	private static final long serialVersionUID = 8235559218442134134L;

	@Column(name = "nome", nullable = false, length = 60)
	private String nome;

	@Column(name = "login", nullable = false, length = 12)
	private String login;

	@Column(name = "password")
	private String password;
	
	public Usuario() {
		
	}

	public Usuario(String nome, String login, String password) {
		super();
		this.nome = nome;
		this.login = login;
		this.password = password;
	}

}
