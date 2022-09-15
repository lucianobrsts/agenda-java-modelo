package br.com.agendajavamodelo.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "name")
public class Usuario extends AbstractEntity {

	private static final long serialVersionUID = 8235559218442134134L;

	private String nome;
	private String login;
	private String senha;

	public Usuario() {
	}

	public Usuario(String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

}
