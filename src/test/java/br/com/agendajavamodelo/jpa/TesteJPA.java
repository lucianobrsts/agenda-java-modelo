package br.com.agendajavamodelo.jpa;

import br.com.agendajavamodelo.dao.DAO;
import br.com.agendajavamodelo.domain.Usuario;

public class TesteJPA {

	public static void main(String[] args) {

		Usuario usuario = new Usuario("Luciano Brito", "lucianobrsts", "123456");
		DAO<Usuario> daoUsuario = new DAO<>(Usuario.class);
	}

}