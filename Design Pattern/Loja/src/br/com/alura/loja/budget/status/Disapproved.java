package br.com.alura.loja.budget.status;

import br.com.alura.loja.budget.Budget;

public class Disapproved extends BudgetStatus{
	
	public void finalized(Budget budget) {
		budget.setBudgetStatus(new Finalized());
	}
}
