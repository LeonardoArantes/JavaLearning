package br.com.alura.loja.budget.status;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public class UnderAnalyse extends BudgetStatus{
	
	public BigDecimal calculateAdditionalDiscount(Budget budget){		
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}
	
	public void approved(Budget budget) {
		budget.setBudgetStatus(new Approved());
	}
	
	public void disapproved(Budget budget) {
		budget.setBudgetStatus(new Disapproved());
	}
	
}
