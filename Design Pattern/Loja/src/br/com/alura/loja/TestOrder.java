package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.order.CreateOrder;
import br.com.alura.loja.order.CreateOrderHandler;
import br.com.alura.loja.order.action.SaveDatabase;
import br.com.alura.loja.order.action.SendEmail;

public class TestOrder {
	public static void main(String[] args) {
		String customer = "Leo";
		BigDecimal valueBudget = new BigDecimal("1000");
		int itemQuantity = Integer.parseInt("5");
		
		CreateOrder create = new CreateOrder(customer, valueBudget, itemQuantity);
		
		CreateOrderHandler handler = new CreateOrderHandler(
				Arrays.asList(new SaveDatabase(), 
				new SendEmail()
				));
		handler.execute(create);
	}

}
