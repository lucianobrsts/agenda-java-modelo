package br.com.agendajavamodelo.domain;

public class Colaborador {

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

	@Override
	public String toString() {
		return "Colaborador [nome=" + nome + ", observacao=" + observacao + ", servico=" + servico + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

}
