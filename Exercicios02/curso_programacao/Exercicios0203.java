package curso_programacao;

import java.util.Scanner;

public class Exercicios0203 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Primeiro valor: ");
		int x = sc.nextInt();
		System.out.println("Digite o Segundo valor: ");
		int y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0)
			System.out.println("São Multiplos;");
		else
			System.out.println("Não são Multiplos;");
		
		sc.close();
	}
}
