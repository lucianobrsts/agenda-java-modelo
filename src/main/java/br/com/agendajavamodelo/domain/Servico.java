package br.com.agendajavamodelo.domain;

import java.util.Date;

public class Servico {

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

	@Override
	public String toString() {
		return "Servico [descricao=" + descricao + ", observacao=" + observacao + ", valor=" + valor
				+ ", formaPagamento=" + formaPagamento + ", dataServico=" + dataServico + ", dataPagamento="
				+ dataPagamento + ", cliente=" + cliente + ", colaborador=" + colaborador + "]";
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Date getDataServico() {
		return dataServico;
	}

	public void setDataServico(Date dataServico) {
		this.dataServico = dataServico;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

}
