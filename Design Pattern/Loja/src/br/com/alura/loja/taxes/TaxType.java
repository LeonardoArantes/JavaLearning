package br.com.alura.loja.taxes;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public interface TaxType {
	BigDecimal calculate(Budget budget);
}
