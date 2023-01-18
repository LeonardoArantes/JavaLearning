package br.com.alura.loja.budjet;

import java.math.BigDecimal;

public class Budget {
	
	private BigDecimal value;
	private int itemQuantity;
	
	public Budget(BigDecimal value, int itemQuantity) {
		this.value = value;
		this.itemQuantity = itemQuantity;
	}
	public BigDecimal getValue() {
		return value;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
}
