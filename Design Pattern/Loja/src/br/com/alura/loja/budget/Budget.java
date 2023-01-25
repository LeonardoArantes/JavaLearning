package br.com.alura.loja.budget;

import java.math.BigDecimal;

import br.com.alura.loja.budget.status.BudgetStatus;
import br.com.alura.loja.budget.status.UnderAnalyse;

public class Budget {
	
	private BigDecimal value;
	private int itemQuantity;
	private BudgetStatus budgetStatus;
	
	public Budget(BigDecimal value, int itemQuantity) {
		this.value = value;
		this.itemQuantity = itemQuantity;
		this.budgetStatus = new UnderAnalyse();
	}
	public BigDecimal getValue() {
		return value;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	
	public BudgetStatus getBudgetStatus() {
		return budgetStatus;
	}
	public void setBudgetStatus(BudgetStatus budgetStatus) {
		this.budgetStatus = budgetStatus;
	}
	public void isAdditionalDiscountApplicable() {
		BigDecimal extraDiscountValue = this.budgetStatus.calculateAdditionalDiscount(this);
		
		this.value = this.value.subtract(extraDiscountValue);
	}

	public void  approve() {
		this.budgetStatus.approved(this);
	}
	
	public void disapprove() {
		this.budgetStatus.disapproved(this);
	}
	
	public void finalize() {
		this.budgetStatus.finalized(this);
	}
	
	
	
	
	





}
