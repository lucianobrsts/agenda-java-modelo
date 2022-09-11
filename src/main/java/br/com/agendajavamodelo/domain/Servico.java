package br.com.agendajavamodelo.domain;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Servico extends AbstractEntity {

	private static final long serialVersionUID = -9040048787327789081L;

	private String descricao;
	private String observacao;
	private Double valor;
	private String formaPagamento;
	private Date dataServico;
	private Date dataPagamento;
	private Cliente cliente;
	private Colaborador colaborador;

	public Servico() {
	}

	public Servico(String descricao, String observacao, Double valor, String formaPagamento, Date dataServico,
			Date dataPagamento, Cliente cliente, Colaborador colaborador) {
		this.descricao = descricao;
		this.observacao = observacao;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
		this.dataServico = dataServico;
		this.dataPagamento = dataPagamento;
		this.cliente = cliente;
		this.colaborador = colaborador;
	}

}
