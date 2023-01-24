package br.com.alura.loja.discount;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public abstract class Discount {
	
	protected Discount next;

	public Discount(Discount next) {
		super();
		this.next = next;
	}
	
	//Template Method
	public BigDecimal calculating(Budget budget){
		if(isApplicable(budget)) {
			return doCalculate(budget);
		}
		return next.calculating(budget);
	}
	
	protected abstract BigDecimal doCalculate(Budget budget);
	protected abstract boolean isApplicable(Budget budget);
}
