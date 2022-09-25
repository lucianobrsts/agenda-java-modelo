package br.com.agendajavamodelo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "colaborador")
@Data
@EqualsAndHashCode(callSuper=false)
public class Colaborador extends AbstractEntity{

	private static final long serialVersionUID = -5873555166532282377L;

	@Column(name = "nome", nullable = false, length = 60)
	private String nome;
	
	@Column(name = "observacao", length = 100)
	private String observacao;

	public Colaborador() {
		
	}

	public Colaborador(String nome, String observacao) {
		this.nome = nome;
		this.observacao = observacao;
	}

}
