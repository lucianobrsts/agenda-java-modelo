package br.com.agendajavamodelo.domain;

import java.util.Date;

import javax.persistence.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Cliente extends AbstractEntity{
	
	private static final long serialVersionUID = -2236845954696800900L;

	@Column(name = "nome", nullable = false, length = 60)
	private String nome;
	
	@Column(name = "celular", nullable = false, length = 20)
	private String celular;
	
	@Column(name = "whatsapp", length = 20)
	private String whatsapp;
	
	@Column(name = "observacao", length = 80)
	private String observacao;
	
	@Column(name = "data_nascimento")
	private Date dataNascimento;

	public Cliente() {
		
	}

	public Cliente(String nome, String celular, String whatsapp, String observacao, Date dataNascimento) {
		super();
		this.nome = nome;
		this.celular = celular;
		this.whatsapp = whatsapp;
		this.observacao = observacao;
		this.dataNascimento = dataNascimento;
	}

}
