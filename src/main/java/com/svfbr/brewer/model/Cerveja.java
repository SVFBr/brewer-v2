package com.svfbr.brewer.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@NoArgsConstructor
public class Cerveja {

	@NotEmpty
	private String sku;

	@NotEmpty
	private String nome;

	@NotEmpty
	@Size(min = 20, message = "Descrição deve ter no mínimo 20 caracteres")
	private String descricao;

}
