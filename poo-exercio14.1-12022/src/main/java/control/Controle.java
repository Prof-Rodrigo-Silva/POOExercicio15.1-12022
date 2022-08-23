package control;

import model.CalculaTotal;

public class Controle {
	
	public static double calculaTotal(double juros, double anos, double deposito) {
		return CalculaTotal.calculaTotal(juros, anos, deposito);
	}

}
