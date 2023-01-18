package br.com.alura.loja.taxes;

import java.math.BigDecimal;

import br.com.alura.loja.budjet.Budget;

public class TaxationCalculation {
	public BigDecimal calculate(Budget budget, TaxType taxType) {
		return taxType.calculate(budget);
	}
}
