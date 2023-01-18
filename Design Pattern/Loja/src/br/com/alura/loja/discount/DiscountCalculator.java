package br.com.alura.loja.discount;

import java.math.BigDecimal;

import br.com.alura.loja.budjet.Budget;

public class DiscountCalculator {
	//chain of responsability
	public BigDecimal calculate(Budget budget) {
		Discount discount = new BudgetDiscountHighItemsNumber(
							new BudgetDiscountHighValue(
							new BudgetWithoutDiscount()));
		return discount.calculate(budget);
	
	}
}
