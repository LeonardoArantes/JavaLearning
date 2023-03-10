package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.discount.DiscountCalculator;

public class TestDiscount {
	public static void main(String[] args) {
		Budget budget = new Budget(new BigDecimal("200"), 6);
		Budget budget1 = new Budget(new BigDecimal("200"), 3);
		Budget budget2 = new Budget(new BigDecimal("500"), 4);
		
		DiscountCalculator calculator = new DiscountCalculator();
	
		System.out.println(calculator.calculate(budget));
		System.out.println(calculator.calculate(budget1));
		System.out.println(calculator.calculate(budget2));
	}
}
