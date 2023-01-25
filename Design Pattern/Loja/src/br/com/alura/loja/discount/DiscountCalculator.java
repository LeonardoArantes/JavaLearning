package br.com.alura.loja.discount;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public class DiscountCalculator {
	//chain of responsability
	public BigDecimal calculate(Budget budget) {
		Discount ChainOfDiscount = new BudgetDiscountHighItemsNumber(
							new BudgetDiscountHighValue(
							new BudgetWithoutDiscount()));
		return ChainOfDiscount.calculating(budget);
	
	}
}
