package br.com.alura.loja.discount;

import java.math.BigDecimal;

import br.com.alura.loja.budjet.Budget;

public class BudgetWithoutDiscount extends Discount{
	
	public BudgetWithoutDiscount() {
		super(null);
	}

	public BigDecimal calculate(Budget budget) {
		return BigDecimal.ZERO;

	}

}
