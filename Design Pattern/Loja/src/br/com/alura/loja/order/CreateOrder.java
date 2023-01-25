package br.com.alura.loja.order;

import java.math.BigDecimal;

public class CreateOrder {
	
	private String name;
	private BigDecimal valueBuget;
	private int itemsQuantity;
		
	public CreateOrder(String name, BigDecimal valueBuget, int itemsQuantity) {
		this.name = name;
		this.valueBuget = valueBuget;
		this.itemsQuantity = itemsQuantity;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getValueBuget() {
		return valueBuget;
	}

	public int getItemsQuantity() {
		return itemsQuantity;
	}
	
}
