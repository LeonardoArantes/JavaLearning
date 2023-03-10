package br.com.alura.loja.budget.status;

import java.math.BigDecimal;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.budget.Budget;

public abstract class BudgetStatus {

	//state
	
	public BigDecimal calculateAdditionalDiscount(Budget budget){		
		return BigDecimal.ZERO;
	}
	
	public void approved(Budget budget) {
		throw new DomainException("Budget cannot be approved");
	}
	
	public void disapproved(Budget budget) {
		throw new DomainException("Budget cannot be disapproved");
	}
	
	public void finalized(Budget budget) {
		throw new DomainException("Budget cannot be finalized");
	}
}
