package Exercicio2;

public class ExercicioCONTA {
	
	private double saldo;

	void deposita(double valor) {
		this.saldo += valor;
		
		
	}

	public double getSaldo() {
		return this.saldo;
	}

}
