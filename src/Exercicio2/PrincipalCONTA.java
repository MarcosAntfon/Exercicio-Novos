package Exercicio2;
 
public class PrincipalCONTA {
 	
	public static void main(String[] args) {
		
		ExercicioCONTA exercicioCONTA = new ExercicioCONTA();
		
		exercicioCONTA.deposita(100.0);
		System.out.println(exercicioCONTA.getSaldo());
		
	}

	private double valor;


	private double getSaldo() {
		return this.valor;
	}

	private static void deposita(double d) {
		
	}
	

}
