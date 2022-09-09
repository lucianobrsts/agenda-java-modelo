package br.com.agendajavamodelo.domain;

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

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", login=" + login + ", senha=" + senha + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
