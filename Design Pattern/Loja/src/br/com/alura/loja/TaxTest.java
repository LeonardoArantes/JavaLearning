package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.budjet.Budget;
import br.com.alura.loja.taxes.ICMS;
import br.com.alura.loja.taxes.ISS;
import br.com.alura.loja.taxes.TaxationCalculation;

public class TaxTest {
	//Strategy
	public static void main(String[] args) {
		Budget budget = new Budget(new BigDecimal("100"));
		TaxationCalculation calculator = new TaxationCalculation();
		System.out.println(calculator.calculate(budget, new ICMS()));
		System.out.println(calculator.calculate(budget, new ISS()));
	}
}
