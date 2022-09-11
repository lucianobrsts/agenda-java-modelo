package br.com.agendajavamodelo.domain;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Cliente extends AbstractEntity {

	private static final long serialVersionUID = 268271021148204370L;

	private String nome;
	private Date dataNascimento;
	private String Celular;
	private String whatsApp;
	private String observacao;

	public Cliente() {

	}

	public Cliente(String nome, Date dataNascimento, String celular, String whatsApp, String observacao) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		Celular = celular;
		this.whatsApp = whatsApp;
		this.observacao = observacao;
	}

}
