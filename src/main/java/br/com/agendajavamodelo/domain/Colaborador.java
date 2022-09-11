package br.com.agendajavamodelo.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Colaborador extends AbstractEntity {

	private static final long serialVersionUID = -994877661371176228L;

	private String nome;
	private String observacao;
	private Servico servico;

	public Colaborador() {

	}

	public Colaborador(String nome, String observacao, Servico servico) {
		this.nome = nome;
		this.observacao = observacao;
		this.servico = servico;
	}

}
