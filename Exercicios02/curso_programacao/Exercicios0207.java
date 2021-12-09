package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios0207 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite o valor do eixo x: ");
		double x = sc.nextDouble();
		System.out.println("Digite o valor do eixo y: ");
		double y = sc.nextDouble();
		
		if( x == 0.0 && y == 0.0)
			System.out.println("origem");
		else if (x > 0.0 && y > 0.0)
			System.out.println("Quadrante 1");
		else if (x < 0.0 && y > 0.0)
			System.out.println("Quadrante 2");
		else if (x < 0.0 && y < 0.0)
			System.out.println("Quadrante 3");
		else System.out.println("Quadrante 4");
		
		sc.close();
	}
}
