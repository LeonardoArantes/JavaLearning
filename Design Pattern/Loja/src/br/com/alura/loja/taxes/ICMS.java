package br.com.alura.loja.taxes;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public class ICMS implements TaxType {
	public BigDecimal calculate(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}

}
