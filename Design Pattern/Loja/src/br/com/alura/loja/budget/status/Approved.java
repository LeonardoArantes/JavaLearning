package br.com.alura.loja.budget.status;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public class Approved extends BudgetStatus{
	
	public BigDecimal calculateAdditionalDiscount(Budget budget){		
		return budget.getValue().multiply(new BigDecimal("0.02"));
	}
	
	public void finalized(Budget budget) {
		budget.setBudgetStatus(new Finalized());
	}
}
