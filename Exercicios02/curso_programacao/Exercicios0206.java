package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios0206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um valor de 0 a 100: ");
		double x = sc.nextDouble();
		
		if (x >= 0 && x <= 25)	
			System.out.println("Intevalor [0,25]");
		else if (x > 25 && x <= 50)
			System.out.println("Intervalo [25,50]");
		else if (x > 50 && x <= 75)
			System.out.println("Intervalo [50,75]");
		else if (x > 75 && x <= 100)
			System.out.println("Intervalo [75,100]");
		else System.out.println("Intervalo não permitido");
		
		sc.close();
	}

}
