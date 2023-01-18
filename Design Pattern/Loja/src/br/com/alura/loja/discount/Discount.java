package br.com.alura.loja.discount;

import java.math.BigDecimal;

import br.com.alura.loja.budjet.Budget;

public abstract class Discount {
	
	protected Discount next;

	public Discount(Discount next) {
		super();
		this.next = next;
	}
	
	public abstract BigDecimal calculate(Budget budget);
}