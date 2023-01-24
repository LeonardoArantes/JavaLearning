package br.com.alura.loja.taxes;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public class TaxationCalculation {
	public BigDecimal calculate(Budget budget, TaxType taxType) {
		return taxType.calculate(budget);
	}
}
