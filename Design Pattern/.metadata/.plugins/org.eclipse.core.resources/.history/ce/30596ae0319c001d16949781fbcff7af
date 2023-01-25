package br.com.alura.loja.discount;

import java.math.BigDecimal;

import br.com.alura.loja.budjet.Budget;

public class BudgetDiscountHighItemsNumber extends Discount{

	public BudgetDiscountHighItemsNumber(Discount next) {
		super(next);
	}

	public BigDecimal doCalculate(Budget budget) {
		System.out.println("APLICA DESCONTO POR MAIOR QUANTIDADE");
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean isApplicable(Budget budget) {
		return budget.getItemQuantity() > 5;
	}

}
