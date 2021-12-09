package curso_programacao;

import java.util.Scanner;

public class Exercicios0202 {
	public static void main(String args[])
	{
		
		System.out.println("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x % 2 == 0)
			System.out.println("Par");
		else
			System.out.println("Impar");
		
		sc.close();
	}
}
