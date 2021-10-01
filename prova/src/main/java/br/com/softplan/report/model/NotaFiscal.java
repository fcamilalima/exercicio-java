package br.com.softplan.report.model;

import java.math.BigDecimal;

public class NotaFiscal {

	private Long id;
	private BigDecimal value;
	
	public NotaFiscal(Long id, BigDecimal value) {
		super();
		this.id = id;
		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public BigDecimal getValue() {
		return value;
	}
	
}
