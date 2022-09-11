package br.com.agendajavamodelo.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class AbstractEntity implements Serializable {

	private static final long serialVersionUID = -6302920971743000821L;

	protected Long id;

}
