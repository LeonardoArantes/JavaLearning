package br.com.alura.loja.discount;

import java.math.BigDecimal;

import br.com.alura.loja.budjet.Budget;

public class BudgetDiscountHighItemsNumber extends Discount{

	public BudgetDiscountHighItemsNumber(Discount next) {
		super(next);
	}

	public BigDecimal calculate(Budget budget) {
		if(budget.getItemQuantity() > 5)
			return budget.getValue().multiply(new BigDecimal("0.1"));
			
		return next.calculate(budget);
	
	}

}
