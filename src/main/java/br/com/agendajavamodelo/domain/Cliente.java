package br.com.agendajavamodelo.domain;

import java.util.Date;

public class Cliente {

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

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", dataNascimento=" + dataNascimento + ", Celular=" + Celular + ", whatsApp="
				+ whatsApp + ", observacao=" + observacao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCelular() {
		return Celular;
	}

	public void setCelular(String celular) {
		Celular = celular;
	}

	public String getWhatsApp() {
		return whatsApp;
	}

	public void setWhatsApp(String whatsApp) {
		this.whatsApp = whatsApp;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
