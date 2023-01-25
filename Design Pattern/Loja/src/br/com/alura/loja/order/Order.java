package br.com.alura.loja.order;

import java.time.LocalDateTime;

import br.com.alura.loja.budget.Budget;

public class Order {
	
	private String Customer;
	private LocalDateTime date;
	private Budget budget;
	
	public Order(String customer, LocalDateTime date, Budget budget) {
		Customer = customer;
		this.date = date;
		this.budget = budget;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Budget getBudget() {
		return budget;
	}

	public void setBudget(Budget budget) {
		this.budget = budget;
	}
	
}
