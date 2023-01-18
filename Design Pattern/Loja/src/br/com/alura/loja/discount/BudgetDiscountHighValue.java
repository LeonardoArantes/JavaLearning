package br.com.alura.loja.discount;

import java.math.BigDecimal;

import br.com.alura.loja.budjet.Budget;

public class BudgetDiscountHighValue extends Discount{
	
	public BudgetDiscountHighValue(Discount next) {
		super(next);
	}

	public BigDecimal calculate(Budget budget) {
		if (budget.getValue().compareTo(new BigDecimal("500")) >= 0)
			return budget.getValue().multiply(new BigDecimal("0.05"));

		return next.calculate(budget);

	}

}
