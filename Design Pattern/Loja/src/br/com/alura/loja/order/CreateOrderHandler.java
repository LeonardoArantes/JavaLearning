package br.com.alura.loja.order;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.order.action.Actions;

public class CreateOrderHandler{
	
	//constructor with injection

	private List<Actions> action;

	//Listener or Observer
	public CreateOrderHandler(List<Actions> actions) {
		this.action = actions;
	}

	public void execute(CreateOrder data) {

		Budget budget = new Budget(data.getValueBuget(), data.getItemsQuantity());
		Order order = new Order(data.getName(), LocalDateTime.now(), budget);
		action.forEach(a -> a.execute(order));
	}
}
