package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.order.CreateOrder;
import br.com.alura.loja.order.CreateOrderHandler;

public class TestOrder {
	public static void main(String[] args) {
		String customer = args[0];
		BigDecimal valueBudget = new BigDecimal(args[1]);
		int itemQuantity = Integer.parseInt(args[2]);
		
		CreateOrder create = new CreateOrder(customer, valueBudget, itemQuantity);
		
		CreateOrderHandler handler = new CreateOrderHandler(/*injectedDependencies*/);
		handler.execute(create);
	}

}
