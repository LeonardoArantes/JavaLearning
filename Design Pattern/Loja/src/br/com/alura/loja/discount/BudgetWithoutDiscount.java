package br.com.alura.loja.discount;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public class BudgetWithoutDiscount extends Discount{
	
	public BudgetWithoutDiscount() {
		super(null);
	}

	public BigDecimal doCalculate(Budget budget) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean isApplicable(Budget budget) {
		return true;
	}

}
