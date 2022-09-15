package br.com.agendajavamodelo.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class AbstractEntity implements Serializable {

	private static final long serialVersionUID = -6302920971743000821L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

}
