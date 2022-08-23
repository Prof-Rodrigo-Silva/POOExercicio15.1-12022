package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculaTotal {
	
	public static double calculaTotal(double juros, double anos, double deposito_mensal) {
	
	int num_pagamentos = (int) (anos * 12);
	double total = 0;
	for (int i = 0; i < num_pagamentos; i++) {
	total = total + deposito_mensal;
	total = total + total * juros;
	}
	BigDecimal bd = new BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN);
	return bd.doubleValue();
	
	}

}
