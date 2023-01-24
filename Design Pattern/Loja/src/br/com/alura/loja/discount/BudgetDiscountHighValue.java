package br.com.alura.loja.discount;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public class BudgetDiscountHighValue extends Discount{
	
	public BudgetDiscountHighValue(Discount next) {
		super(next);
	}

	public BigDecimal doCalculate(Budget budget) {
		System.out.println("APLICA DESCONTO POR MAIOR VALOR");
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean isApplicable(Budget budget) {
		return budget.getValue().compareTo(new BigDecimal("500")) >= 0;
	}

}
