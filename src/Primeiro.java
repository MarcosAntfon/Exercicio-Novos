import java.util.Scanner; 

public class Primeiro {

	public static void main(String args[])    {       

		Scanner scan = new Scanner(System.in);   
		
		int x,y,z,w;
		
		System.out.print("Digite o primeiro número: " );         
		x = scan.nextInt();         
		
		System.out.print("Digite o segundo número: " );         
		y = scan.nextInt(); 
		
		System.out.println("Digite o terceiro número: ");
		z = scan.nextInt();
		 
		System.out.println("digite o quarto Número: ");
		w = scan.nextInt();
		
		int soma = soma(x,y,z,w);         
		int subtracao =  subtracao(x,y,z,w);         
		int divisao  = divisao(x,y,z,w);         
		int multiplicacao = multiplicacao(x,y,z,w);
		
System.out.println("A soma" +soma);         
System.out.println("A subtracao" +subtracao);               
System.out.println("A divisao" +divisao);               
System.out.println("A multiplicacao" +multiplicacao);    
}

	private static int multiplicacao(int x, int y, int z, int w) {
		return x*y*z*w;
	}

	private static int divisao(int x, int y, int z, int w) {
		return x/y/z/w;
	}

	private static int soma(int x, int y, int z, int w) {
		return x+y+z+w;
	}

	private static int subtracao(int x, int y, int z, int w) {
		return x-y-z-w;
	}                               
}



