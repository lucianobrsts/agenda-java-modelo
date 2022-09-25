package br.com.agendajavamodelo.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "servico")
@Data
@EqualsAndHashCode(callSuper = false)
public class Servico extends AbstractEntity {
	
	private static final long serialVersionUID = -7324269491165950070L;

	@Column(name = "descricao", nullable = false, length = 60)
	private String descricao;
	
	@Column(name = "data_do_servico")
	private Date data_do_servico;
	
	@Column(name = "data_do_pagamento")
	private Date data_do_pagamento;
	
	@Column(name = "valor", precision = 7, scale = 2, nullable = false)
	private BigDecimal valor;
	
	@Column(name = "forma_de_pagamento", nullable = false, length = 40)
	private String forma_de_pagamento;
	
	@Column(name = "observacao", length = 100)
	private String observacao;
	
	public Servico() {
	}

	public Servico(String descricao, Date data_do_servico, Date data_do_pagamento, BigDecimal valor,
			String forma_de_pagamento, String observacao) {
		super();
		this.descricao = descricao;
		this.data_do_servico = data_do_servico;
		this.data_do_pagamento = data_do_pagamento;
		this.valor = valor;
		this.forma_de_pagamento = forma_de_pagamento;
		this.observacao = observacao;
	}

}
