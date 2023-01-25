package br.com.alura.loja.order;

import java.time.LocalDateTime;

import br.com.alura.loja.budget.Budget;

public class CreateOrderHandler {
	
	//constructor with injection
	
	public void execute(CreateOrder data) {
		Budget budget = new Budget(data.getValueBuget(), data.getItemsQuantity());
		Order order = new Order(data.getName(), LocalDateTime.now(), budget);
		
		System.out.println("save code on database");
	}

}
