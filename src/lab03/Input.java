package lab03;

import java.util.Scanner;

public class Input {
	
	Scanner entrada = new Scanner(System.in);
	
	public String lerString() {
		String stringRetorno = entrada.nextLine();
		return stringRetorno;
	}
	
	public double  lerDouble() {
		double doubleRetorno = entrada.nextDouble();
		entrada.nextLine();
		return doubleRetorno;
	}
	
	public int lerInteiro() {
		int inteiroRetorno = entrada.nextInt();
		entrada.nextLine();
		return inteiroRetorno;
	}	
	

}
